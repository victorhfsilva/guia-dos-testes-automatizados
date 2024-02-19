# **Testes de APIs com Cypress**

Testar APIs é crucial para garantir que sua aplicação interaja corretamente com os serviços web. O Cypress oferece recursos poderosos para testes de APIs. Aqui está um guia rápido:

1. **Requisições HTTP Básicas:**

   Use o comando `cy.request` para fazer requisições HTTP e realizar verificações.

   ```javascript
   cy.request('GET', '/api/endpoint').then((response) => {
     expect(response.status).to.equal(200);
     expect(response.body).to.have.property('key', 'value');
   });
   ```

2. **Trabalhando com Headers:**

   Adicione headers às suas requisições para testar diferentes cenários.

   ```javascript
   cy.request({
     method: 'POST',
     url: '/api/endpoint',
     headers: {
       'Content-Type': 'application/json',
       'Authorization': 'Bearer YourTokenHere'
     },
     body: {
       // dados do corpo
     }
   });
   ```

3. **Enviando Dados no Corpo da Requisição:**

   Teste a manipulação correta de dados enviados no corpo da requisição.

   ```javascript
   cy.request('POST', '/api/endpoint', {
     key: 'value'
   }).then((response) => {
     // lógica de teste
   });
   ```

4. **Testando Respostas JSON:**

   Verifique se a API retorna respostas JSON e valide o conteúdo.

   ```javascript
   cy.request('/api/endpoint').its('headers').its('content-type').should('include', 'application/json');
   ```

5. **Testando Códigos de Resposta:**

   Garanta que a API retorne códigos de resposta apropriados.

   ```javascript
   cy.request('/api/endpoint').its('status').should('eq', 200);
   ```

6. **Testando Tempo de Resposta:**

   Avalie o tempo de resposta da API para garantir desempenho.

   ```javascript
   cy.request('/api/endpoint').should((response) => {
     expect(response.duration).to.be.lessThan(1000); // Tempo em milissegundos
   });
   ```

7. **Testando Autenticação:**

   Teste cenários de autenticação, como tokens JWT.

   ```javascript
   cy.request({
     method: 'GET',
     url: '/api/authenticated-endpoint',
     headers: {
       Authorization: 'Bearer YourAuthToken'
     }
   });
   ```

8. **Testando Erros e Exceções:**

   Garanta que a API lide corretamente com erros.

   ```javascript
   cy.request({
     method: 'GET',
     url: '/api/errored-endpoint',
     failOnStatusCode: false
   }).then((response) => {
     expect(response.status).to.equal(500);
     expect(response.body).to.have.property('error');
   });
   ```

9. **Utilizando Fixtures:**

   Armazene dados de requisição e resposta em arquivos fixtures.

   ```javascript
   cy.fixture('example').then((example) => {
     cy.request({
       method: 'POST',
       url: '/api/endpoint',
       body: example
     });
   });
   ```

10. **Testando com Múltiplos Ambientes:**

    Configure variáveis de ambiente para testar em diferentes ambientes.

    ```javascript
    const baseUrl = Cypress.env('apiUrl');
    cy.request(`${baseUrl}/api/endpoint`);
    ```

Certifique-se de entender a estrutura da sua API para criar testes significativos e abrangentes. Considere testar diferentes cenários, como autenticação, respostas de erro e manipulação de dados.
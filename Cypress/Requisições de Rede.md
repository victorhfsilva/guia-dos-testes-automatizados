# Requisições de Rede no Cypress

### Interceptando Requisições:

- **cy.intercept()**: Este comando permite interceptar requisições de rede feitas pela aplicação durante o teste. Ele pode ser usado para simular respostas de servidores ou verificar se as requisições estão sendo feitas corretamente.
   ```javascript
   cy.intercept('GET', '/api/data').as('getData')
   ```

- **Esperando por Requisições Interceptadas**: Após interceptar uma requisição, você pode esperar por ela usando o alias que você atribuiu.
   ```javascript
   cy.wait('@getData')
   ```
    **Exemplo:**

    ```javascript
    cy.intercept('GET', '/api/data').as('getData')
    cy.visit('/')
    cy.wait('@getData')
    ```
    O alias é uma referência nomeada que você atribui a uma interceptação de requisição específica no Cypress. Ele é usado para identificar essa interceptação de forma única e permitir que você acesse e aja sobre ela posteriormente no teste.
    

- **Respondendo a Requisições**: Além de apenas interceptar, você pode responder a requisições interceptadas para simular diferentes cenários.

   ```javascript
   cy.intercept('POST', '/api/update', { statusCode: 200, body: 'Success' }).as('updateData')
   ```

### Verificando Requisições:

   ```javascript
   cy.intercept('POST', '/api/data').as('postData')
   cy.get('.submit-button').click()
   cy.wait('@postData').then((interception) => {
     expect(interception.request.body).to.have.property('key', 'value')
   })
   ```

### Verificando Respostas:

   ```javascript
   cy.intercept('POST', '/api/update', { statusCode: 200, body: 'Success' }).as('updateData')
   cy.get('.update-button').click()
   cy.wait('@updateData').then((interception) => {
     expect(interception.response.statusCode).to.eq(200)
     expect(interception.response.body).to.eq('Success')
   })
   ```

### Testando Cenários de Falha:

   ```javascript
   cy.intercept('GET', '/api/data', { statusCode: 500, body: 'Internal Server Error' }).as('getDataError')
   ```

### Usando Fixtures para Dados de Requisição:

**Fixtures para Dados de Requisição**: Utilize fixtures para armazenar os dados de resposta de requisições, tornando os testes mais consistentes e menos dependentes do estado do servidor.

1. **Crie a Fixture**:
   Primeiro, você precisa criar um arquivo que contenha os dados que deseja usar como resposta de requisição. Por exemplo, vamos criar um arquivo JSON chamado `data.json`:

   ```json
   {
     "id": 1,
     "name": "John Doe",
     "email": "john.doe@example.com"
   }
   ```

2. **Configure a Interceptação da Requisição**:
   Em seguida, você usa o comando `cy.intercept()` para interceptar a requisição e configurar a resposta utilizando a fixture que você criou:

   ```javascript
   cy.intercept('GET', '/api/data', { fixture: 'data.json' }).as('getData')
   ```

3. **Espera e Verificação**:
   Agora você pode visitar a página que faz a requisição para `/api/data` e esperar pela interceptação usando o alias atribuído. Em seguida, você pode realizar verificações com base nos dados fornecidos pela fixture:

   ```javascript
   cy.visit('/')
   cy.wait('@getData').then((interception) => {
     expect(interception.response.body).to.deep.equal({
       "id": 1,
       "name": "John Doe",
       "email": "john.doe@example.com"
     })
   })
   ```

Neste exemplo:
- Uma requisição GET para `/api/data` será interceptada e respondida com os dados contidos na fixture `data.json`.
- A espera é feita pelo alias `'getData'`, garantindo que a interceptação ocorra antes de realizar as verificações.
- A resposta da interceptação é verificada para garantir que os dados recebidos correspondam aos dados da fixture.


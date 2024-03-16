# **Comandos Personalizados no Cypress**

No Cypress, você pode criar comandos personalizados para encapsular funcionalidades específicas e tornar seus testes mais legíveis e reutilizáveis. 

### **Criar um Comando Customizado:**

   Crie comandos personalizados no arquivo `commands.js` no diretório `cypress/support`.

   ```javascript
   Cypress.Commands.add('login', (username, password) => {
     // Lógica de login aqui
   });
   ```

### **Usando um Comando Personalizado nos Testes:**

   Após a criação do comando, você pode usá-lo nos seus testes.

   ```javascript
   // cypress/e2e/seu-teste-spec.cy.js

   cy.login('seu-usuario', 'sua-senha');
   ```

### **Comando com Parâmetros Opcionais:**

   Você pode tornar os parâmetros opcionais, fornecendo valores padrão.

   ```javascript
   // cypress/support/commands.js

   Cypress.Commands.add('login', (username = 'default-user', password = 'default-password') => {
     // Lógica de login aqui
   });
   ```

### **Retornar Valores do Comando:**

   Se desejar que seu comando retorne um valor, use `then`.

   ```javascript
   // cypress/support/commands.js

   Cypress.Commands.add('getToken', () => {
     // Lógica para obter o token
     return cy.request('sua-api/token').its('body.token');
   });
   ```

   ```javascript
   // cypress/e2e/seu-teste-spec.cy.js

   cy.getToken().then((token) => {
     // Faça algo com o token
   });
   ```

Comandos personalizados no Cypress são uma maneira eficaz de abstrair lógica comum e melhorar a manutenção e legibilidade dos seus testes.
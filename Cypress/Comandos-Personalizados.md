**Comandos Personalizados no Cypress**

No Cypress, você pode criar comandos personalizados para encapsular funcionalidades específicas e tornar seus testes mais legíveis e reutilizáveis. Aqui está um guia rápido sobre como criar e usar comandos personalizados:

1. **Criar um Comando Customizado:**

   Crie comandos personalizados no arquivo `commands.js` no diretório `cypress/support`.

   ```javascript
   // cypress/support/commands.js

   Cypress.Commands.add('login', (username, password) => {
     // Lógica de login aqui
   });
   ```

2. **Usar um Comando Personalizado nos Testes:**

   Após a criação do comando, você pode usá-lo nos seus testes.

   ```javascript
   // cypress/integration/seu-teste-spec.js

   cy.login('seu-usuario', 'sua-senha');
   ```

3. **Comando com Parâmetros Opcionais:**

   Você pode tornar os parâmetros opcionais, fornecendo valores padrão.

   ```javascript
   // cypress/support/commands.js

   Cypress.Commands.add('login', (username = 'default-user', password = 'default-password') => {
     // Lógica de login aqui
   });
   ```

4. **Retornar Valores do Comando:**

   Se desejar que seu comando retorne um valor, use `then`.

   ```javascript
   // cypress/support/commands.js

   Cypress.Commands.add('getToken', () => {
     // Lógica para obter o token
     return cy.request('sua-api/token').its('body.token');
   });
   ```

   ```javascript
   // cypress/integration/seu-teste-spec.js

   cy.getToken().then((token) => {
     // Faça algo com o token
   });
   ```

5. **Encapsular Lógica Complexa:**

   Use comandos personalizados para encapsular lógica complexa.

   ```javascript
   // cypress/support/commands.js

   Cypress.Commands.add('fazerAlgoComplexo', () => {
     // Lógica complexa aqui
   });
   ```

   ```javascript
   // cypress/integration/seu-teste-spec.js

   cy.fazerAlgoComplexo();
   ```

6. **Usar em Diferentes Contextos:**

   Comandos personalizados podem ser usados em vários contextos, incluindo `before`, `beforeEach`, etc.

   ```javascript
   // cypress/support/commands.js

   Cypress.Commands.add('login', () => {
     // Lógica de login aqui
   });

   Cypress.Commands.add('realizarAlgo', () => {
     // Lógica para fazer algo após o login
   });
   ```

   ```javascript
   // cypress/integration/seu-teste-spec.js

   before(() => {
     cy.login();
   });

   it('Deve realizar algo após o login', () => {
     cy.realizarAlgo();
   });
   ```

Comandos personalizados no Cypress são uma maneira eficaz de abstrair lógica comum e melhorar a manutenção e legibilidade dos seus testes.
# **Variáveis de Ambiente no Cypress**

No Cypress, você pode usar variáveis de ambiente para configurar e parametrizar seus testes.

### **Configuração de Variáveis de Ambiente:**

   Defina suas variáveis de ambiente no arquivo `cypress.config.json`:

   ```javascript
  const { defineConfig } = require("cypress");
  
  module.exports = defineConfig({
      e2e: {
        setupNodeEvents(on, config) {
          // implement node event listeners here
      },
      env: {
        login_url: '/login',
        products_url: '/products',
      }
    })
   ```

  Também é possível definir variáveis de ambiente no arquivo `cypress.env.json`:

  ```json
  {
    "host": "veronica.dev.local",
    "api_server": "http://localhost:8888/api/v1/"
  }
  ```

  Além disso todas as variáveis de ambiente com o prefixo `CYPRESS_` do seu sistema serão interpretados pelo Cypress com suas próprias variáveis de ambiente.

### **Configuração de Variáveis de Ambiente via Linha de Comando:**

   Configure variáveis de ambiente ao executar seus testes via linha de comando.

   ```bash
   npx cypress run --env API_URL=https://api.teste.com,USERNAME=teste,PASSWORD=12345
   ```


### **Acessando Variáveis de Ambiente nos Testes:**

   Você pode acessar variáveis de ambiente usando `Cypress.env()`.

   ```javascript
   const env = Cypress.env() // {login_url: '/login', products_url: '/products'}
   const loginUrl = Cypress.env('login_url'); // '/login'
   const products_url = Cypress.env('products_url') // '/products'
   ```

### **Usando Variáveis de Ambiente em Requisições de API:**

   Passe variáveis de ambiente diretamente para suas requisições de API.

   ```javascript
   cy.request({
     method: 'POST',
     url: `${Cypress.env('API_URL')}/login`,
     body: {
       username: Cypress.env('USERNAME'),
       password: Cypress.env('PASSWORD')
     }
   });
   ```


**Variáveis de Ambiente no Cypress**

No Cypress, você pode usar variáveis de ambiente para configurar e parametrizar seus testes. Isso é útil para lidar com diferentes ambientes, como desenvolvimento, teste e produção. Aqui está um guia rápido sobre como usar variáveis de ambiente no Cypress:

1. **Configuração de Variáveis de Ambiente:**

   Defina suas variáveis de ambiente no arquivo `cypress.json`:

   ```json
   // cypress.json

   {
     "env": {
       "API_URL": "https://api.exemplo.com",
       "USERNAME": "seu-usuario",
       "PASSWORD": "sua-senha"
     }
   }
   ```

2. **Acessando Variáveis de Ambiente nos Testes:**

   Você pode acessar variáveis de ambiente usando `Cypress.env()`.

   ```javascript
   const apiUrl = Cypress.env('API_URL');
   const username = Cypress.env('USERNAME');
   const password = Cypress.env('PASSWORD');
   ```

3. **Usando Variáveis de Ambiente em Requisições de API:**

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

4. **Alterando Variáveis de Ambiente via Linha de Comando:**

   Substitua variáveis de ambiente ao executar seus testes via linha de comando.

   ```bash
   npx cypress run --env API_URL=https://api.teste.com,USERNAME=teste,PASSWORD=12345
   ```

5. **Variáveis de Ambiente para Diferentes Ambientes:**

   Configure diferentes valores para diferentes ambientes.

   ```json
   // cypress.json

   {
     "env": {
       "development": {
         "API_URL": "https://api.dev.com",
         "USERNAME": "dev-usuario",
         "PASSWORD": "dev-senha"
       },
       "production": {
         "API_URL": "https://api.prod.com",
         "USERNAME": "prod-usuario",
         "PASSWORD": "prod-senha"
       }
     }
   }
   ```

   ```javascript
   const apiUrl = Cypress.env('API_URL'); // Valor dependendo do ambiente configurado
   ```

6. **Usando Variáveis de Ambiente em Plugins e Comandos Personalizados:**

   Variáveis de ambiente também podem ser acessadas em plugins e comandos personalizados.

   ```javascript
   // plugins/index.js

   module.exports = (on, config) => {
     const apiUrl = process.env.API_URL || config.env.API_URL;
     // Restante do código aqui
     return config;
   };
   ```

As variáveis de ambiente no Cypress proporcionam flexibilidade e facilitam a criação de testes que podem ser executados em diferentes ambientes sem a necessidade de alterar o código do teste.
# **Cypress: Configuração Básica**

O Cypress é uma ferramenta poderosa para testes de ponta a ponta (end-to-end) em aplicações web. Aqui está um guia básico de configuração para começar:

### **1. Instalação:**

Certifique-se de que você tenha o Node.js instalado. Em seguida, execute:

```bash
npm install --save-dev cypress
```

Ou,

```bash
yarn add cypress -D
```

#### Testing Library

Para instalar o Testing Library:

```bash
npm install --save-dev @testing-library/cypress
```

Ou,

```bash
yarn add -D @testing-library/cypress
```

Para incluir o plugin Testing Library do Cypress, configure o arquivo cypress.json com as seguintes configurações:

```json
{
    "baseUrl": "http://localhost:3000", // Seu URL base (se aplicável)
    "testFiles": "**/*.spec.js", // Padrão para os arquivos de teste
    "pluginsFile": "cypress/plugins/index.js",
    "supportFile": "cypress/support/index.js"
}
```


### **2. Inicialização do Cypress:**

Depois de instalado, você pode iniciar o Cypress com:

```bash
npx cypress open
```

Esta linha de comando abrirá a interface gráfica do Cypress.

### **3. Estrutura do Projeto:**

O Cypress espera que seus testes estejam no diretório `cypress/integration` por padrão. Você pode configurar essa estrutura no arquivo `cypress.json`.

### **4. Arquivo `cypress.json`:**

Você pode criar este arquivo na raiz do seu projeto. Aqui estão algumas configurações comuns:

```json
{
  "baseUrl": "http://localhost:3000", // URL base da sua aplicação
  "integrationFolder": "cypress/tests", // Diretório personalizado para testes
  "video": false, // Desativa a gravação de vídeo dos testes (opcional)
  "viewportWidth": 1366, // Largura da janela do navegador (opcional)
  "viewportHeight": 768 // Altura da janela do navegador (opcional)
}
```

### **5. Arquivo `cypress/support/index.js`:**

Você pode usar este arquivo para importar bibliotecas e adicionar comandos personalizados. Exemplo:

```javascript
// cypress/support/index.js

// Importar a biblioteca chai
import 'chai/register-should';

// Adicionar comandos personalizados
Cypress.Commands.add('login', (username, password) => {
  // Implementação do login
});
```

### **6. Arquivo `cypress/plugins/index.js`:**

Você pode usar este arquivo para configurar plugins Cypress, se necessário. Exemplo:

```javascript
// cypress/plugins/index.js

// Configurar plugin de relatório HTML
module.exports = (on, config) => {
  require('cypress-html-reporter')(on);
};
```

### **7. Escrever Testes:**

Os testes Cypress são escritos em JavaScript. Aqui está um exemplo básico:

```javascript
// cypress/integration/exemplo_spec.js

describe('Exemplo de Teste', () => {
  it('Deve visitar a página inicial', () => {
    cy.visit('/');
    cy.contains('Bem-vindo ao Meu Site');
  });

  it('Deve fazer login', () => {
    cy.login('usuario', 'senha');
    cy.url().should('include', '/dashboard');
  });
});
```

### **8. Execução em Linha de Comando:**

Você pode executar seus testes em segundo plano usando a linha de comando:

```bash
npx cypress run
```

### **9. Configuração de Variáveis de Ambiente:**

Use variáveis de ambiente para configurações sensíveis, como credenciais de API.

```javascript
// cypress/integration/exemplo_variaveis_ambiente_spec.js

const apiKey = Cypress.env('API_KEY');

describe('Teste com Variáveis de Ambiente', () => {
  it('Deve usar a chave da API', () => {
    // Utilize a chave da API nos testes
  });
});
```

Este é um guia básico. O Cypress oferece muitos recursos avançados para testes mais complexos. Certifique-se de consultar a [documentação oficial do Cypress](https://docs.cypress.io/) para explorar mais.
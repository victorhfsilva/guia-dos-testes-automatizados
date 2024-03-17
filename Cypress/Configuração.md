# **Configuração Básica**

O Cypress é uma ferramenta poderosa para testes de ponta a ponta (end-to-end) em aplicações web. 

### **Instalação:**

Certifique-se de que você tenha o Node.js instalado. Em seguida, execute:

```bash
npm install --save-dev cypress
```

Ou,

```bash
yarn add cypress -D
```

#### Instalação das dependências no Linux:

Caso esteja utilizando Linux, instale as seguintes dependências:

- Ubuntu:

```bash
apt-get install libgtk2.0-0 libgtk-3-0 libgbm-dev libnotify-dev libnss3 libxss1 libasound2 libxtst6 xauth xvfb
```

- Arch: 

```
pacman -S gtk2 gtk3 alsa-lib xorg-server-xvfb libxss nss libnotify
```

**Referência:** [Linux Prerequisites](https://docs.cypress.io/guides/getting-started/installing-cypress#Linux-Prerequisites)


### **Inicialização do Cypress:**

Depois de instalado, você pode iniciar o Cypress com:

```bash
npx cypress open
```

O que abrirá a interface gráfica do Cypress.

#### **Execução em Linha de Comando:**

Você pode executar seus testes em segundo plano usando a linha de comando:

```bash
npx cypress run
```

### **Escrevendo Testes:**

Os testes Cypress são escritos em JavaScript. Aqui está um exemplo básico:

```javascript
describe('template spec', () => {
  it('passes', () => {
    cy.visit('https://example.cypress.io/commands/querying')
    cy.get('#query-btn').should('contain', 'Button')
  })
})
```

### **Definindo a URL Base:**

Para definir a url base no arquivo `cypress.config.js` basta adicionar:

```javascript
const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    baseUrl: 'https://example.cypress.io/',
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
  },
});
```

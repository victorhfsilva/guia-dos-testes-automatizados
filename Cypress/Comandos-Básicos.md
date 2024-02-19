**Comandos Básicos do Cypress**

O Cypress é uma ferramenta poderosa para testar aplicações front-end. Aqui está um guia rápido dos comandos básicos do Cypress:

### **1. Instalação:**

   - Instale o Cypress via npm ou yarn.

```bash
npm install --save-dev cypress
# ou
yarn add --dev cypress
```

### **2. Abrir o Cypress:**

   - Abra o Cypress no terminal.

```bash
npx cypress open
# ou
yarn run cypress open
```

### **3. Escrever Testes:**

   - Crie arquivos de teste na pasta `cypress/integration`.
   - Exemplo: `cypress/integration/sample_spec.js`

```javascript
describe('My First Test', function () {
  it('Visits the Kitchen Sink', function () {
    cy.visit('https://example.cypress.io');
    cy.contains('type').click();
    cy.url().should('include', '/commands/actions');
  });
});
```

### **4. Executar Testes em Modo Headless (Sem Interface Gráfica):**
   - Execute testes diretamente no terminal.
```bash
npx cypress run
# ou
yarn run cypress run
```

### **5. Seletores:**
   - Use seletores para interagir com elementos.
```javascript
cy.get('.my-class'); // por classe
cy.get('#my-id'); // por ID
cy.get('[data-cy=my-data-cy]'); // por atributo data-cy
```

### **6. Comandos de Ação:**

   - Execute ações em elementos.

```javascript
cy.click();
cy.type('Hello, Cypress!');
cy.select('Option 1');
```

### **7. Asserções:**

   - Verifique se os elementos ou valores são como esperado.

```javascript
cy.get('.result').should('have.text', 'Expected Text');
cy.url().should('include', '/expected-url');
```

### **8. Comandos de Navegação:**

   - Navegue entre páginas.

```javascript
cy.visit('https://example.com');
cy.go('back');
cy.go('forward');
```

### **9. Tempo de Espera:**

   - Use comandos como `cy.wait` para lidar com elementos que podem não estar imediatamente disponíveis.

```javascript
cy.get('.loading-spinner').should('not.exist');
cy.wait(2000); // Espera por 2 segundos
```

### **10. Comandos Utilitários:**

   - Alguns comandos úteis.

```javascript
cy.log('Mensagem de Log');
cy.clearCookies();
cy.clearLocalStorage();
```

### **11. Custom Commands:**

   - Crie comandos personalizados para reutilização.

```javascript
// Adicione no arquivo commands.js dentro da pasta support
Cypress.Commands.add('login', () => {
  // Lógica de login
});

// Use no teste
cy.login();
```

### **12. Múltiplos Testes:**

   - Execute vários testes.

```javascript
// No arquivo de teste
describe('Test Suite', function () {
  it('Test Case 1', function () {
    // ...
  });

  it('Test Case 2', function () {
    // ...
  });
});
```

Os comandos básicos do Cypress oferecem uma base sólida para começar a escrever testes de aceitação eficazes para suas aplicações web.
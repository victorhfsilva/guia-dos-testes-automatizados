# Esperas no Cypress

### Esperas Básicas:

**cy.wait()**: Pausa a execução do teste por um período específico.
   ```javascript
   cy.wait(1000) // Pausa por 1 segundo
   ```

**cy.contains()**: Espera até que um elemento contenha um texto específico antes de realizar uma ação nele.
   ```javascript
   cy.contains('Submit').click() // Clica no botão com o texto 'Submit' após ele ser encontrado
   ```

### Esperas por Elementos:

**cy.get()**: Espera até que um elemento seja encontrado na página antes de realizar uma ação nele.
   ```javascript
   cy.get('.login-button').click() // Espera pelo botão com a classe 'login-button' e então clica nele
   ```

**cy.find()**: Usado em conjunto com cy.get(), espera até que um elemento dentro de um elemento selecionado seja encontrado.
   ```javascript
   cy.get('.parent-element').find('.child-element').click() // Espera pelo elemento filho dentro de '.parent-element' e então clica nele
   ```

### Esperas de Visibilidade e Existência:

**cy.should('be.visible')**: Espera até que um elemento seja visível na página.
   ```javascript
   cy.get('.loading-spinner').should('not.be.visible') // Espera até que o spinner de carregamento não seja mais visível
   ```

**cy.should('exist')**: Espera até que um elemento exista na página.
   ```javascript
   cy.get('.error-message').should('exist') // Espera até que a mensagem de erro exista na página
   ```

### Esperas de Requisições de Rede:

**cy.intercept()**: Interceptar solicitações de rede e esperar por elas.
   ```javascript
   cy.intercept('GET', '/api/data').as('getData')
   cy.visit('/')
   cy.wait('@getData') // Espera pela resposta da requisição 'GET /api/data'
   ```

### Esperas Personalizadas:

**Esperas Retornadas por Comandos Customizados**: Você pode criar comandos customizados que retornam promessas e, em seguida, esperar por essas promessas.
   ```javascript
   Cypress.Commands.add('waitForElementToBeLoaded', () => {
     return cy.get('.loaded-element').should('exist') // Comando customizado que espera até que '.loaded-element' exista
   })

   cy.waitForElementToBeLoaded() // Espera até que '.loaded-element' seja encontrado
   ```

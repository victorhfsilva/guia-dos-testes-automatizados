# Navegação no Cypress

### Comandos de Navegação Básica:

**cy.visit()**: Este comando é usado para visitar uma URL específica.
   ```javascript
   cy.visit('https://www.example.com')
   ```

**cy.go()**: Permite navegar para trás ou para frente no histórico do navegador.
   ```javascript
   cy.go('back') // Navega para a página anterior
   cy.go('forward') // Navega para a próxima página
   ```

**cy.reload()**: Recarrega a página atual.
   ```javascript
   cy.reload()
   ```

### Comandos de Navegação de Elementos:

**cy.get()**: Recupera um elemento da página. Pode ser usado para interagir com links ou botões para navegar para outras páginas.
   ```javascript
   cy.get('.link-class').click() // Clica em um link com a classe 'link-class'
   ```

**cy.contains()**: Localiza um elemento contendo um texto específico e, em seguida, interage com ele.
   ```javascript
   cy.contains('Next Page').click() // Clica em um elemento que contém o texto 'Next Page'
   ```

### Comandos de URL e Histórico:

**cy.url()**: Obtém a URL atual.
   ```javascript
   cy.url().should('include', '/login') // Verifica se a URL inclui '/login'
   ```

**cy.location()**: Obtém a localização atual, permitindo verificar a URL, hostname, pathname, etc.
   ```javascript
   cy.location().should((loc) => {
     expect(loc.pathname).to.eq('/dashboard') // Verifica se o pathname é '/dashboard'
   })
   ```
# Seletores do Cypress

Seletores são usados para identificar e interagir com elementos HTML em uma página da web. Eles são essenciais para escrever testes automatizados no Cypress, pois permitem que você localize elementos específicos para realizar ações como clicar, digitar texto ou verificar o conteúdo. 

### **Seletores Básicos**:

- **ID**: Seletor que identifica um elemento pelo seu atributo `id`.
  ```javascript
  cy.get('#elementId')
  ```

- **Classe**: Seletor que identifica um ou mais elementos pela sua classe CSS.
  ```javascript
  cy.get('.elementClass')
  ```

- **Tag HTML**: Seletor que identifica todos os elementos de um tipo específico.
  ```javascript
  cy.get('input') // Todos os inputs
  ```

### **Seletores de Texto**:

- **Conteúdo**: Seletor que identifica elementos com um texto específico.
  ```javascript
  cy.contains('Submit') // Elemento que contém o texto "Submit"
  ```

### **Seletores Avançados**:

- **Atributo**: Seletor que identifica elementos com um atributo específico.
  ```javascript
  cy.get('[data-testid="submit-button"]') // Elemento com o atributo data-testid="submit-button"
  ```

- **Pseudo-seletores**: Permitem selecionar elementos com base em seu estado ou posição.
  ```javascript
  cy.get(':visible') // Elementos visíveis
  cy.get(':nth-child(2)') // Segundo elemento de um conjunto
  ```

- **Combinação de Seletores**: Você pode combinar diferentes tipos de seletores para refinar sua busca.
  ```javascript
  cy.get('ul li.active') // Lista de itens com a classe 'active'
  ```

### **Seletores de Atributo Específico**:

- **Seletores de Input**: Permitem selecionar inputs por seu tipo, nome ou valor.
  ```javascript
  cy.get('input[type="email"]') // Input do tipo "email"
  ```

- **Seletores de Formulário**: Permitem selecionar elementos de formulário por seu tipo, nome ou valor.
  ```javascript
  cy.get('form input[name="username"]') // Input com o atributo name="username" dentro de um formulário
  ```

Lembre-se de escolher seletores que sejam específicos, robustos e que não dependam de atributos ou classes que possam mudar frequentemente. Isso garantirá que seus testes sejam mais estáveis e menos propensos a quebrar com pequenas alterações na estrutura da página.
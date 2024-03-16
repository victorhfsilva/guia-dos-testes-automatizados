# Asserções

As asserções são usadas para verificar o estado ou o comportamento esperado de elementos, eventos ou ações em sua aplicação durante a execução dos testes no Cypress. Elas garantem que sua aplicação está funcionando conforme o esperado e que os testes estão passando corretamente. 

## Estado do Elemento

### **Verificar a Existência de Elementos**:

- **cy.get().should('exist')**: Verifica se um elemento existe na página.
  ```javascript
  cy.get('.header').should('exist') // Verifica se o elemento com a classe 'header' existe
  ```

### **Verificar a Visibilidade de Elementos**:

- **cy.get().should('be.visible')**: Verifica se um elemento está visível na página.
  ```javascript
  cy.get('.modal').should('be.visible') // Verifica se o modal está visível
  ```

- **cy.get().should('not.be.visible')**: Verifica se um elemento não está visível na página.
  ```javascript
  cy.get('.loading-spinner').should('not.be.visible') // Verifica se o spinner de carregamento não está visível
  ```

### **Assegurando que um Elemento Esteja Oculto:**

- O comando `should()` com a opção `'be.hidden'` é utilizado para verificar se um elemento está oculto na página.

  ```javascript
  cy.get('seletor').should('be.hidden');
  ```

### **Verificar Estado de Elementos**:

- **cy.get().should('be.enabled')**: Verifica se um elemento está habilitado.
  ```javascript
  cy.get('.submit-button').should('be.enabled') // Verifica se o botão de envio está habilitado
  ```

- **cy.get().should('be.disabled')**: Verifica se um elemento está desabilitado.
  ```javascript
  cy.get('.submit-button').should('be.disabled') // Verifica se o botão de envio está desabilitado
  ```

### **Assegurando que um Elemento Não Esteja Presente:**

- O comando `should()` com a opção `'not.exist'` é utilizado para verificar se um elemento não está presente na página.

  ```javascript
  cy.get('seletor').should('not.exist');
  ```

## Conteúdo do Elemento

### **Verificar o Conteúdo de Elementos**:

- **cy.contains()**: Verifica se um elemento contém um texto específico.
  ```javascript
  cy.contains('Welcome').should('be.visible') // Verifica se o texto 'Welcome' está visível na página
  ```

- **cy.get().should('have.text')**: Verifica se o texto de um elemento corresponde ao esperado.
  ```javascript
  cy.get('.title').should('have.text', 'Hello World') // Verifica se o elemento com a classe 'title' tem o texto 'Hello World'
  ```

### **Assegurando que um Elemento Contenha um Valor Específico:**

- O comando `should()` com a opção `'have.value'` é usado para verificar se um elemento possui um valor específico.


  ```javascript
  cy.get('seletor').should('have.value', 'Valor Esperado');
  ```

### **Assegurando a Quantidade de Elementos Correspondentes:**

- O comando `should()` com a opção `'have.length'` é usado para verificar a quantidade de elementos correspondentes a um seletor.

  **Exemplo:**
  ```javascript
  cy.get('seletor').should('have.length', quantidade-esperada);
  ```

## Atributos do Elemento

### **Assegurando que um Elemento Contenha uma Classe Específica:**

- O comando `should()` com a opção `'have.class'` é usado para verificar se um elemento contém uma classe específica.

  ```javascript
  cy.get('seletor').should('have.class', 'minha-classe');
  ```

### **Assegurando que um Elemento Não Contenha uma Classe Específica:**

- O comando `should()` com a opção `'not.have.class'` é utilizado para verificar se um elemento não contém uma classe específica.

  ```javascript
  cy.get('seletor').should('not.have.class', 'classe-indesejada');
  ```

### **Verificar Atributos de Elementos**:

- **cy.get().should('have.attr')**: Verifica se um elemento tem um determinado atributo com um valor específico.
  ```javascript
  cy.get('input[type="email"]').should('have.attr', 'placeholder', 'Enter your email') // Verifica se o input do tipo 'email' tem o atributo 'placeholder' com o valor 'Enter your email'
  ```

## CSS do Elemento

### **Assegurando que um Elemento Tenha um CSS Específico:**

- O comando `should()` com a opção `'have.css'` é usado para verificar se um elemento possui um estilo CSS específico.

  ```javascript
  cy.get('seletor').should('have.css', 'propriedade-css', 'valor-esperado');
  ```


## Navegação e Rede


### **Verificar URL de Navegação**:

- **cy.url()**: Obtém a URL atual e verifica se ela corresponde à esperada.
  ```javascript
  cy.url().should('include', '/login') // Verifica se a URL contém '/login'
  ```

### **Verificar Comportamento de Requisições de Rede**:

- **cy.intercept()**: Intercepta requisições de rede e verifica se elas foram feitas corretamente.
  ```javascript
  cy.intercept('GET', '/api/data').as('getData')
  cy.visit('/')
  cy.wait('@getData').its('response.statusCode').should('eq', 200) // Verifica se a requisição 'GET /api/data' retornou um status de sucesso (código 200)
  ```

Essas são algumas das asserções mais comuns que você pode usar no Cypress para verificar o comportamento e o estado dos elementos em sua aplicação. Elas ajudam a garantir que sua aplicação esteja funcionando conforme o esperado e que os testes estejam passando corretamente. Ao escrever testes, é importante escolher as asserções adequadas para verificar os aspectos importantes da sua aplicação e garantir sua qualidade.

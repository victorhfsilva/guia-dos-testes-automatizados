# Comandos de Ações no Cypress

Comandos de ação no Cypress são usados para interagir com elementos na página da web durante a execução de testes automatizados. Eles permitem que você simule ações do usuário, como clicar em botões, preencher formulários, navegar entre páginas, entre outros. 

### **Clicar em Elementos**:

- **cy.click()**: Simula um clique em um elemento na página.
  ```javascript
  cy.get('.button').click() // Clica em um elemento com a classe 'button'
  ```

### **Preencher Campos de Formulário**:

- **cy.type()**: Preenche um campo de formulário com texto.
  ```javascript
  cy.get('#username').type('user123') // Preenche o campo de ID 'username' com o texto 'user123'
  ```

- **cy.clear()**: Limpa o conteúdo de um campo de formulário.
  ```javascript
  cy.get('#password').clear() // Limpa o campo de ID 'password'
  ```

### **Selecionar Opções em Elementos de Seleção**:

- **cy.select()**: Seleciona uma opção em um elemento de seleção (como `<select>`).
  ```javascript
  cy.get('#dropdown').select('Option 1') // Seleciona a opção com texto 'Option 1' em um elemento de ID 'dropdown'
  ```

### **Enviar Formulários**:

- **cy.submit()**: Envia um formulário.
  ```javascript
  cy.get('form').submit() // Envia o formulário presente na página
  ```

### **Manipulação de Elementos Arrastáveis**:

- **cy.drag()**: Simula a ação de arrastar e soltar um elemento.
  ```javascript
  cy.get('.draggable').drag('.droppable') // Arrasta o elemento com a classe 'draggable' e solta-o no elemento com a classe 'droppable'
  ```

### Focar em um Elemento:

- **focus()**: é usado para focar em um elemento específico na página. Isso pode ser útil ao testar a interação com campos de entrada ou elementos interativos.

  ```javascript
  cy.get('seletor').focus();
  ```

### Deslocar a Página para um Elemento:

- **scrollIntoView()**: é usado para rolar a página até que o elemento especificado esteja visível na janela do navegador. Isso é útil ao testar elementos que estão fora da visualização inicial da página.

  ```javascript
  cy.get('seletor').scrollIntoView();
  ```

### Simular o Pressionamento de Tecla:

- **type()**: podemos simular o pressionamento de uma tecla específica em um elemento. Por exemplo, podemos simular o pressionamento da tecla "Enter" após preencher um campo de texto.

  ```javascript
  cy.get('seletor').type('{enter}');
  ```

### Simular Arrastar e Soltar Elementos:

- **trigger()**: Podemos simular a ação de arrastar e soltar elementos usando os comandos `trigger()` encadeados. Isso é útil ao testar funcionalidades que envolvem a interação do usuário com elementos arrastáveis.

  ```javascript
  cy.get('elemento-fonte').trigger('mousedown').get('elemento-alvo').trigger('mousemove').trigger('mouseup');
  ```

### Simular o Movimento do Mouse:

- **trigger()**: Com o comando `trigger()`, também podemos simular o movimento do mouse sobre um elemento. Isso pode ser útil ao testar a resposta da aplicação a eventos de hover.

  ```javascript
  cy.get('seletor').trigger('mouseover');
  ```

Estes são alguns dos comandos de ação mais comuns no Cypress. Eles permitem que você simule diversas interações do usuário durante a execução dos testes automatizados, garantindo que sua aplicação seja testada de forma abrangente e confiável.
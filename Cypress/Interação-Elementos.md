**Interação com Elementos no Cypress**

Interagir com elementos é uma parte essencial dos testes no Cypress. Aqui estão alguns comandos e práticas comuns:

1. **Clicar em um Elemento:**

   ```javascript
   cy.get('seletor').click();
   ```

2. **Preencher um Campo de Texto:**

   ```javascript
   cy.get('input').type('Texto a ser inserido');
   ```

3. **Limpar um Campo de Texto:**

   ```javascript
   cy.get('input').clear();
   ```

4. **Selecionar uma Opção em um Dropdown:**

   ```javascript
   cy.get('select').select('Opção Desejada');
   ```

5. **Interagir com Radio Buttons:**

   ```javascript
   cy.get('input[type="radio"]').check();
   ```

6. **Interagir com Checkboxes:**

   ```javascript
   cy.get('input[type="checkbox"]').check();
   ```

7. **Focar em um Elemento:**

   ```javascript
   cy.get('seletor').focus();
   ```

8. **Esperar até que um Elemento Esteja Disponível para Interação:**

   ```javascript
   cy.get('seletor', { timeout: 10000 }).should('be.visible').click();
   ```

9. **Esperar até que um Elemento Esteja Clicável:**

   ```javascript
   cy.get('seletor', { timeout: 10000 }).should('be.enabled').click();
   ```

10. **Deslocar a Página para um Elemento:**

    ```javascript
    cy.get('seletor').scrollIntoView();
    ```

11. **Simular o Pressionamento de Tecla:**

    ```javascript
    cy.get('seletor').type('{enter}');
    ```

12. **Gatilho de Evento Personalizado:**

    ```javascript
    cy.get('seletor').trigger('nome-do-evento');
    ```

13. **Arrastar e Soltar Elementos:**

    ```javascript
    cy.get('elemento-fonte').trigger('mousedown').get('elemento-alvo').trigger('mousemove').trigger('mouseup');
    ```

14. **Simular o Movimento do Mouse:**

    ```javascript
    cy.get('seletor').trigger('mouseover');
    ```

15. **Esperar um Tempo Específico:**

    ```javascript
    cy.wait(2000); // Espera por 2 segundos
    ```

Essas são apenas algumas interações básicas com elementos no Cypress. Combine esses comandos conforme necessário para cobrir uma variedade de cenários de teste.
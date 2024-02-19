**Cypress Fixtures**

**1. Criando Fixtures:**
   - As fixtures no Cypress são arquivos JSON que contêm dados de teste.
   - Crie um arquivo JSON dentro do diretório `cypress/fixtures`.

```plaintext
cypress
│
└── fixtures
    └── example.json
```

**2. Estrutura de uma Fixture:**
   - Uma fixture é um arquivo JSON simples.
   - Exemplo:

```json
// example.json
{
  "user": {
    "username": "testuser",
    "password": "testpassword"
  },
  "products": [
    {
      "id": 1,
      "name": "Product 1",
      "price": 29.99
    },
    {
      "id": 2,
      "name": "Product 2",
      "price": 19.99
    }
  ]
}
```

**3. Utilizando Fixtures nos Testes:**
   - Use o método `cy.fixture()` para carregar dados de uma fixture.

```javascript
// Exemplo de uso em um teste
cy.fixture('example.json').then((data) => {
  // 'data' contém o conteúdo da fixture
  cy.log(data.user.username); // Saída: testuser
  cy.log(data.products[0].name); // Saída: Product 1
});
```

**4. Usando Fixtures para Dados de Teste:**
   - Carregue dados de fixtures para simular cenários de teste.

```javascript
// Exemplo: Preenchendo um formulário com dados de uma fixture
cy.fixture('example.json').then((data) => {
  cy.get('#username').type(data.user.username);
  cy.get('#password').type(data.user.password);
  cy.get('form').submit();
});
```

**5. Fixtures para Testes de API:**
   - Use fixtures para definir payloads ou dados de resposta em testes de API.

```javascript
// Exemplo: Definindo um payload em uma fixture para um teste de API
cy.fixture('apiPayload.json').then((payload) => {
  cy.request('POST', '/api/endpoint', payload).then((response) => {
    // Assertions no response
  });
});
```

**6. Fixtures Dinâmicas:**
   - Use a opção `onBeforeLoad` para carregar dinamicamente uma fixture.

```javascript
// Exemplo: Carregando dinamicamente uma fixture com base na hora atual
cy.fixture('example.json', 'utf-8', { onBeforeLoad: (content) => ({ ...content, timestamp: Date.now() }) });
```

**7. Múltiplas Fixtures:**
   - Carregue várias fixtures em um único teste.

```javascript
// Exemplo: Carregando múltiplas fixtures
cy.fixture('user.json').as('userData');
cy.fixture('products.json').as('productData');

cy.get('@userData').then((userData) => {
  // Use dados do usuário
});

cy.get('@productData').then((productData) => {
  // Use dados do produto
});
```

As fixtures no Cypress oferecem uma maneira eficaz de gerenciar dados de teste de forma organizada, tornando os testes mais legíveis e fáceis de manter.
#  Asserções Explícitas

No Cypress, o `expect` é uma ferramenta poderosa usada para fazer assertivas explícitas em seus testes. Ele permite verificar explicitamente o comportamento esperado de elementos, eventos ou ações em sua aplicação. 

## Importando o `expect`

Antes de usar o `expect`, certifique-se de importá-lo no seu arquivo de teste Cypress. O `expect` é fornecido pelo Chai, uma biblioteca de asserções.

```javascript
import { expect } from 'chai';
```

## Sintaxe Básica do `expect`

O `expect` segue uma sintaxe simples e intuitiva, permitindo que você especifique o valor que está sendo testado e encadeie métodos de asserção para verificar o comportamento desejado.

```javascript
expect(valor).metodoDeAssertiva(valorEsperado);
```

## Principais Métodos de Assertiva

Aqui estão alguns dos métodos de asserção mais comuns que você pode usar com o `expect` no Cypress:

- `to.equal`: Verifica se o valor é estritamente igual ao valor esperado.
- `to.contain`: Verifica se o valor contém o valor esperado.
- `to.be.visible`: Verifica se um elemento está visível na página.
- `to.be.disabled`: Verifica se um elemento está desabilitado.
- `to.have.length`: Verifica o comprimento de um array ou a quantidade de elementos correspondentes a um seletor.

## Exemplos de Uso do `expect`

### Verificar Texto de um Elemento

```javascript
const texto = cy.get('.elemento').text();
expect(texto).to.equal('Texto Esperado');
```

### Verificar Visibilidade de um Elemento

```javascript
const elemento = cy.get('.elemento');
expect(elemento).to.be.visible;
```

### Verificar Tamanho de uma Lista

```javascript
const lista = ['item1', 'item2', 'item3'];
expect(lista).to.have.length(3);
```

### Verificar se um Valor é Verdadeiro

```javascript
const valor = true;
expect(valor).to.be.true;
```

## Tratamento de Promessas

É importante observar que o Cypress opera de forma assíncrona e muitas vezes retorna promessas. Portanto, ao usar o `expect` em valores obtidos de comandos Cypress, você deve lidar com promessas adequadamente.

Exemplo:

```javascript
cy.get('.elemento').then(elemento => {
  expect(elemento.text()).to.equal('Texto Esperado');
});
```

## Usando `should` em Conjunto com `expect`

Você também pode usar `should` em conjunto com `expect` para realizar asserções encadeadas. Isso pode ser útil em certas situações, especialmente quando trabalhando com elementos Cypress.

Exemplo:

```javascript
cy.get('.elemento').should(elemento => {
  expect(elemento).to.be.visible;
  expect(elemento.text()).to.equal('Texto Esperado');
});
```

O `expect` é uma ferramenta valiosa para realizar assertivas explícitas em seus testes no Cypress. Com sua sintaxe simples e variedade de métodos de asserção, você pode verificar facilmente o comportamento esperado de elementos e valores em sua aplicação, garantindo que seus testes sejam robustos e confiáveis.
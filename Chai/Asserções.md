# Chai

## Asserções

### 1. Assert

```javascript
const assert = require('chai').assert;

assert.equal(valorReal, valorEsperado); // Verifica se dois valores são iguais.
assert.strictEqual(valorReal, valorEsperado); // Verifica se dois valores são estritamente iguais (mesmo tipo e valor).
assert.notEqual(valorReal, valorEsperado); // Verifica se dois valores não são iguais.
assert.notStrictEqual(valorReal, valorEsperado); // Verifica se dois valores não são estritamente iguais.
```

### 2. Expect

```javascript
const expect = require('chai').expect;

expect(valorReal).to.equal(valorEsperado); // Verifica se dois valores são iguais.
expect(valorReal).to.be.a('tipo'); // Verifica se o valor é do tipo especificado.
expect(valorReal).to.have.length(valorEsperado); // Verifica o comprimento de uma string ou array.
expect(valorReal).to.include(valorEsperado); // Verifica se o valor inclui o valor especificado.
expect(valorReal).to.be.true; // Verifica se o valor é verdadeiro.
expect(valorReal).to.be.false; // Verifica se o valor é falso.
expect(valorReal).to.exist; // Verifica se o valor existe.
```

### 3. Should

```javascript
const should = require('chai').should();

valorReal.should.equal(valorEsperado); // Verifica se dois valores são iguais.
valorReal.should.be.a('tipo'); // Verifica se o valor é do tipo especificado.
valorReal.should.have.length(valorEsperado); // Verifica o comprimento de uma string ou array.
valorReal.should.include(valorEsperado); // Verifica se o valor inclui o valor especificado.
valorReal.should.be.true; // Verifica se o valor é verdadeiro.
valorReal.should.be.false; // Verifica se o valor é falso.
valorReal.should.exist; // Verifica se o valor existe.
```


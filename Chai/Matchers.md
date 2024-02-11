# Chai

## Matchers

O Chai oferece uma ampla gama de matchers para realizar asserções em seus testes. Aqui estão alguns dos matchers mais comuns:

### Matchers de Igualdade

- **equal(valorEsperado)**: Verifica se o valor é igual ao valor esperado.
  
```javascript
expect(valorReal).to.equal(valorEsperado);
assert.equal(valorReal, valorEsperado);
valorReal.should.equal(valorEsperado);
```

- **deep.equal(valorEsperado)**: Verifica se o valor é igual ao valor esperado, recursivamente.

```javascript
expect(valorReal).to.deep.equal(valorEsperado);
assert.deepEqual(valorReal, valorEsperado);
valorReal.should.deep.equal(valorEsperado);
```

### Matchers de Tipagem

- **a(tipo)**: Verifica se o valor é do tipo especificado.

```javascript
expect(valorReal).to.be.a('string');
assert.typeOf(valorReal, 'string');
valorReal.should.be.a('string');
```

### Matchers de Comprimento

- **length(comprimentoEsperado)**: Verifica o comprimento de uma string ou array.

```javascript
expect(valorReal).to.have.length(5);
assert.lengthOf(valorReal, 5);
valorReal.should.have.length(5);
```

### Matchers de Inclusão

- **include(valorEsperado)**: Verifica se o valor inclui o valor especificado.

```javascript
expect(valorReal).to.include('valor');
assert.include(valorReal, 'valor');
valorReal.should.include('valor');
```

### Matchers de Existência

- **exist**: Verifica se o valor existe.

```javascript
expect(valorReal).to.exist;
assert.exists(valorReal);
valorReal.should.exist;
```

### Matchers Booleanos

- **true**: Verifica se o valor é verdadeiro.

```javascript
expect(valorReal).to.be.true;
assert.isTrue(valorReal);
valorReal.should.be.true;
```

- **false**: Verifica se o valor é falso.

```javascript
expect(valorReal).to.be.false;
assert.isFalse(valorReal);
valorReal.should.be.false;
```

### Matchers de Comparação

- **above(valorEsperado)**: Verifica se o valor é maior que o valor especificado.

```javascript
expect(valorReal).to.be.above(5);
assert.isAbove(valorReal, 5);
valorReal.should.be.above(5);
```

- **below(valorEsperado)**: Verifica se o valor é menor que o valor especificado.

```javascript
expect(valorReal).to.be.below(10);
assert.isBelow(valorReal, 10);
valorReal.should.be.below(10);
```

### Matchers de Nulidade

- **null**: Verifica se o valor é nulo.

```javascript
expect(valorReal).to.be.null;
assert.isNull(valorReal);
valorReal.should.be.null;
```

- **undefined**: Verifica se o valor é indefinido.

```javascript
expect(valorReal).to.be.undefined;
assert.isUndefined(valorReal);
valorReal.should.be.undefined;
```

### Matchers de Lançamento de Erro

- **throw(Error)**: Verifica se a função lança um erro.

```javascript
expect(funcao).to.throw(Error);
assert.throw(funcao, Error);
(funcao).should.throw(Error);
```
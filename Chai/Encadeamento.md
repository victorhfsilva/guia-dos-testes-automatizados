# Chai

## Encadeamento

O Chai permite que você encadeie vários métodos para criar asserções mais complexas e legíveis. Aqui estão alguns exemplos de como usar chaining no Chai:

### Encadeamento Básico

Você pode encadear matchers para formar expressões mais complexas:

```javascript
expect(valorReal).to.be.a('string').and.have.length.above(5);
```

### Encadeamento com Modificadores

Você também pode usar modificadores para modificar o comportamento de um matcher:

```javascript
expect(valorReal).to.be.a('string').that.includes('valor').but.not.oneOf(['excluir']);
```

### Encadeamento com Matchers Relacionados

Alguns matchers possuem métodos relacionados que podem ser encadeados para realizar asserções mais específicas:

```javascript
expect(array).to.be.an('array').that.includes('valor').and.has.lengthOf.at.most(10);
```

### Encadeamento com Matchers de Propriedade

Você pode encadear matchers de propriedade para realizar asserções em propriedades de objetos:

```javascript
expect(objeto).to.have.property('chave').that.is.a('string').and.includes('valor');
```

### Encadeamento com Matchers de Cadeia de Métodos

Você pode encadear matchers com métodos de cadeia de objetos para acessar propriedades aninhadas:

```javascript
expect(objeto).to.have.nested.property('chave.subchave').that.is.a('string').and.includes('valor');
```

### Encadeamento com Matchers de Coleção

Para realizar asserções em coleções, como arrays, você pode encadear matchers específicos:

```javascript
expect(array).to.be.an('array').with.lengthOf.at.least(5).and.to.include('valor').but.not.oneOf(['excluir']);
```

### Encadeamento com Matchers de Promessa

Ao lidar com asserções em promessas, você pode encadear matchers para testar o resultado da promessa:

```javascript
expect(promessa).to.eventually.be.fulfilled.and.to.be.a('string').and.include('valor');
```

### Conclusão

O Chaining no Chai permite que você construa asserções complexas e precisas, combinando vários matchers e modificadores. Usando chaining, você pode escrever testes expressivos e de fácil compreensão para suas aplicações.
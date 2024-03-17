# Aliases no Cypress

No Cypress, os aliases são recursos poderosos que permitem referenciar comandos e interceptações de forma fácil e legível em seus testes. Eles são especialmente úteis para evitar repetição de código e melhorar a organização dos testes.

## Criando Aliases

### Comandos Cypress

Para criar um alias para um comando Cypress, utilize o método `.as()` encadeado ao comando desejado. Isso atribui um nome ao comando que pode ser referenciado posteriormente.

```javascript
cy.get('.elemento').as('meuElemento');
```

### Interceptações de Requisições

Para criar um alias para uma interceptação de requisição, utilize o método `.as()` encadeado ao comando `cy.intercept()`. Isso atribui um nome à interceptação que pode ser usada para esperar por essa requisição.

```javascript
cy.intercept('GET', '/api/dados').as('minhaRequisicao');
```

## Utilizando Aliases

### Referenciando Aliases em Comandos

Após criar um alias, você pode referenciá-lo em outros comandos Cypress utilizando o método `@` seguido do nome do alias.

```javascript
cy.get('@meuElemento').click();
```

### Esperando por Aliases

Os aliases são frequentemente utilizados para esperar por comandos ou interceptações antes de continuar com os testes. Isso é feito utilizando o comando `cy.wait()` seguido do nome do alias.

```javascript
cy.wait('@minhaRequisicao');
```

## Usando Aliases em Contextos Diferentes

### Acesso a Aliases em Diferentes Blocos

Os aliases podem ser acessados em diferentes blocos de teste, desde que estejam dentro do mesmo escopo.

```javascript
cy.get('@meuElemento').click();
cy.wait('@minhaRequisicao').then(interceptação => {
  // Faça algo com a interceptação
});
```

### Compartilhamento de Aliases entre Arquivos de Teste

Os aliases podem ser compartilhados entre arquivos de teste, desde que os testes sejam executados sequencialmente na mesma execução do Cypress.

### Limpeza de Aliases

Ao final de cada teste, é boa prática limpar os aliases utilizando o comando `cy.clear()` para evitar conflitos com futuros testes.

# eletores CSS no Cypress

Os seletores CSS são uma parte fundamental para interagir com elementos na página da web durante a automação de testes com o Cypress. Eles permitem selecionar elementos específicos com precisão e realizar ações sobre eles.

### Seletores Básicos:

#### Selecionar Elementos por Tipo:
```css
cy.get('input') // Seleciona todos os elementos <input>
```

#### Selecionar Elementos por ID:
```css
cy.get('#elemento-id') // Seleciona o elemento com o ID 'elemento-id'
```

#### Selecionar Elementos por Classe:
```css
cy.get('.classe-elemento') // Seleciona todos os elementos com a classe 'classe-elemento'
```

### Seletores Combinados:

#### Seletores de Filho (`>`) e Descendente (` `):
```css
cy.get('ul > li') // Seleciona todos os elementos <li> que são filhos diretos de <ul>
cy.get('ul li') // Seleciona todos os elementos <li> que são descendentes de <ul>
```

#### Seletores de Adjacente (`+`) e Irmão Geral (`~`):
```css
cy.get('input + label') // Seleciona o elemento <label> adjacente a um <input>
cy.get('h2 ~ p') // Seleciona todos os elementos <p> irmãos gerais de um <h2>
```

### Seletores de Atributo:

#### Seletores de Atributo:
```css
cy.get('[type="checkbox"]') // Seleciona todos os elementos com o atributo 'type' definido como 'checkbox'
```

#### Seletores de Atributo com Correspondência Parcial:
```css
cy.get('[class^="prefixo"]') // Seleciona todos os elementos com a classe começando com 'prefixo'
```

### Pseudoclasses:

#### Pseudoclasse `:nth-child()`:
```css
cy.get('ul li:nth-child(2)') // Seleciona o segundo elemento <li> de uma lista ordenada
```

#### Pseudoclasse `:first-child` e `:last-child`:
```css
cy.get('ul li:first-child') // Seleciona o primeiro elemento <li> de uma lista não ordenada
cy.get('ul li:last-child') // Seleciona o último elemento <li> de uma lista não ordenada
```

### Seletores Avançados:

#### Seletores de Visibilidade:
```css
cy.get(':visible') // Seleciona todos os elementos visíveis na página
cy.get(':hidden') // Seleciona todos os elementos ocultos na página
```

#### Seletores de Foco:
```css
cy.get(':focus') // Seleciona o elemento atualmente em foco
```

### Combinando Seletores:

#### Combinação de Seletores:
```css
cy.get('form input[type="text"]') // Seleciona todos os elementos <input> do tipo 'text' dentro de um <form>
```

#### Utilizando vários Seletores:
```css
cy.get('input, textarea') // Seleciona todos os elementos <input> e <textarea> na página
```

### Seletores Personalizados:

#### Utilizando Seletores Personalizados:
```css
cy.get('.minha-classe').filter(':visible') // Seleciona todos os elementos com a classe 'minha-classe' que estão visíveis
```

### Utilizando Encadeamento:

#### Encadeamento de Seletores:

```css
cy.get('ul').find('li').eq(2) // Seleciona o terceiro elemento <li> dentro de um <ul>
```

Compreender e utilizar os seletores CSS de forma eficaz no Cypress é essencial para criar testes automatizados robustos e precisos. Utilize os exemplos acima como referência para selecionar e interagir com os elementos da sua aplicação durante a automação de testes.
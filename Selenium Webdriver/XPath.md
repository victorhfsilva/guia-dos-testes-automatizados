# XPath (XML Path Language)

XPath é uma linguagem de consulta usada para navegar e selecionar elementos em um documento XML ou HTML.

## Sintaxe básica:

### **Seleção de elementos por tag:** `tagname` 

Seleciona todos os elementos com o nome de tag especificado.

#### Exemplo: 

```html
<a href="#">Link 1</a>
<a href="#">Link 2</a>
```

O XPath correspondente para selecionar todos os links será:

```
//a
```

#### **Seleção de elementos por atributo:** `[@attribute='value']` 

Seleciona elementos com um atributo específico e valor correspondente.

#### Exemplo: 

```html
<input type="text" id="username" name="username">
<input type="password" id="password" name="password">
```

O XPath correspondente para selecionar o campo de entrada de senha será:

```
//input[@type='password']
```

### **Seleção de elementos por posição:** `[index]` 

Seleciona o elemento com o índice especificado.

#### Exemplo:

```html
<ul>
    <li>Item 1</li>
    <li>Item 2</li>
</ul>
```

```
//li[2]
```

### Outros Exemplos:


#### **Selecionar um link com um atributo específico:**

```xpath
//a[@href='/contact']
```

Exemplo HTML:

```html
<a href="/contact">Entre em contato</a>
```

#### **Selecionar o primeiro link na página:**
  
```xpath
//a[1]
```

Exemplo HTML:

```html
<a href="/about">Sobre nós</a>
<a href="/services">Nossos serviços</a>
```

#### **Selecionar um elemento com uma classe específica:**

```xpath
//div[contains(@class, 'section')]
```

Exemplo HTML:

```html
<div class="section intro">Introdução ao nosso site</div>
```

#### **Selecionar um botão por texto:**

```xpath
//button[text()='Enviar']
```

Exemplo HTML:
```html
<button>Enviar</button>
```

#### **Selecionar um título h1 com base em texto parcial:**

```xpath
//h1[contains(text(), 'Bem-vindo')]
```

Exemplo HTML:
```html
<h1>Bem-vindo ao nosso site</h1>
```

#### **Selecionar parágrafos com base em um atributo parcial:**

```xpath
//p[contains(@class, 'info')]
```

Exemplo HTML:

```html
<p class="info important">Informações importantes sobre o produto</p>
```

#### **Combinar várias condições:**
```xpath
//button[@class='btn primary' and contains(text(), 'Enviar')]
```

Exemplo HTML:

```html
<button class="btn primary">Enviar formulário</button>
```
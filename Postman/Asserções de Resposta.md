# Postman

## Asserções de Respostas 

O Postman permite que você escreva testes automatizados para verificar a validade das respostas recebidas de suas solicitações de API. Esses testes são escritos usando a biblioteca de testes JavaScript interna do Postman e podem incluir uma variedade de asserções para validar diferentes aspectos da resposta. Aqui estão alguns exemplos de asserções comuns:

### Asserções de Status Code

Você pode verificar se o status code da resposta está correto:

```javascript
pm.test("Status code é 200", function () {
    pm.response.to.have.status(200);
});
```

### Asserções de Tempo de Resposta

Você pode verificar se o tempo de resposta está dentro de um limite específico:

```javascript
pm.test("Tempo de resposta é menor que 500ms", function () {
    pm.expect(pm.response.responseTime).to.be.below(500);
});
```

### Asserções de Corpo da Resposta (JSON)

Você pode verificar se o corpo da resposta contém determinados valores:

```javascript
pm.test("Resposta contém o usuário 'João'", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.user).to.equal("João");
});
```

### Asserções de Cabeçalhos

Você pode verificar se os cabeçalhos da resposta estão corretos:

```javascript
pm.test("Tipo de Conteúdo é application/json", function () {
    pm.response.to.have.header("Content-Type", "application/json");
});
```

### Asserções de Conteúdo HTML

Se a resposta for HTML, você pode verificar o conteúdo HTML:

```javascript
pm.test("Resposta contém o título 'Página Inicial'", function () {
    pm.expect(pm.response.text()).to.include("<title>Página Inicial</title>");
});
```

### Asserções de Valores Dinâmicos

Você pode usar variáveis de ambiente ou variáveis globais para verificar valores dinâmicos:

```javascript
pm.test("ID do Usuário é válido", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.user.id).to.equal(pm.variables.get("userID"));
});
```

### Conclusão

As asserções de respostas no Postman permitem que você verifique automaticamente se suas APIs estão retornando as respostas esperadas. Esses testes são essenciais para garantir a qualidade e a confiabilidade de suas APIs, especialmente em um ambiente de desenvolvimento ágil. Com esses exemplos, você pode começar a escrever testes automatizados eficazes para suas solicitações de API no Postman.
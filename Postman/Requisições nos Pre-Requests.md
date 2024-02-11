# Postman

## Requisições nos Pré-Requests

O Postman permite fazer requisições HTTP diretamente nos pré-requests, o que é útil para obter dados dinâmicos, autenticação, configuração de variáveis e outras tarefas necessárias antes do envio da solicitação principal. Abaixo estão alguns exemplos de como fazer requisições nos pré-requests:

### Requisições GET

Você pode fazer uma requisição GET para obter dados antes de enviar a solicitação principal:

```javascript
pm.sendRequest('https://api.example.com/dados', function (err, response) {
    if (err) {
        console.error(err);
    } else {
        console.log(response.json());
        // Faça algo com os dados obtidos
    }
});
```

### Requisições POST

Você pode fazer uma requisição POST para enviar dados ou autenticar antes da solicitação principal:

```javascript
var data = {
    username: 'usuário',
    password: 'senha'
};

pm.sendRequest({
    url: 'https://api.example.com/login',
    method: 'POST',
    header: {
        'Content-Type': 'application/json'
    },
    body: {
        mode: 'raw',
        raw: JSON.stringify(data)
    }
}, function (err, response) {
    if (err) {
        console.error(err);
    } else {
        console.log(response.json());
        // Faça algo com a resposta, como extrair tokens de autenticação
    }
});
```

### Configuração de Variáveis

Você pode usar os dados obtidos em requisições nos pré-requests para configurar variáveis de ambiente:

```javascript
pm.sendRequest('https://api.example.com/dados', function (err, response) {
    if (err) {
        console.error(err);
    } else {
        var dados = response.json();
        pm.environment.set('variavel', dados.valor);
    }
});
```

### Manipulação de Dados

Você pode manipular os dados obtidos em requisições nos pré-requests antes de usá-los na solicitação principal:

```javascript
pm.sendRequest('https://api.example.com/dados', function (err, response) {
    if (err) {
        console.error(err);
    } else {
        var dados = response.json();
        dados.valor = dados.valor * 2;
        pm.variables.set('variavel', dados.valor);
    }
});
```

### Exemplos

#### Obter o Token JWT e Adicionar a uma Requisição

```js
pm.sendRequest({
    url: pm.variables.get('base_url') + "/robots/token",
    method: "POST",
    header: {
        'Content-Type': 'application/json'
    },
    body: {
        mode: 'raw',
        raw: JSON.stringify({
            "username": "victor",
            "password": "password"
        })
    }
}, function (err, response) {
    const token = response.text();
    pm.request.headers.add({key: "Authorization",value:  "Bearer " + token})
});
```

### Conclusão

Usar requisições nos pré-requests no Postman é uma maneira poderosa de automatizar tarefas e configurar variáveis antes de enviar a solicitação principal. Com esses exemplos, você pode realizar uma variedade de tarefas úteis, como obtenção de dados, autenticação e manipulação de variáveis, para garantir que suas solicitações sejam enviadas com sucesso e eficiência.
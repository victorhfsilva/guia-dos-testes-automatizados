# Postman 

## Pré-Request Scripts n

Os pré-request scripts no Postman são scripts escritos em JavaScript que são executados antes que uma solicitação seja enviada. Eles são úteis para configurar variáveis, autenticar usuários, preparar dados de teste e outras tarefas de inicialização necessárias antes de enviar a solicitação. Aqui estão alguns exemplos de como usar os pré-request scripts:

### Configurar Variáveis de Ambiente

Você pode definir variáveis de ambiente que serão usadas em toda a coleção ou em solicitações subsequentes:

```javascript
// Definir uma variável de ambiente
pm.environment.set("apiKey", "sua_chave_de_api");
```

### Autenticar Usuário

Você pode configurar a autenticação para a solicitação:

```javascript
// Configurar a autenticação básica
pm.request.auth.basic(username, password);
```

### Preparar Dados de Teste

Você pode preparar dados de teste antes de enviar a solicitação:

```javascript
// Preparar o corpo da solicitação com dados JSON
var requestBody = {
    nome: "João",
    email: "joao@example.com"
};
pm.request.body = {
    mode: 'raw',
    raw: JSON.stringify(requestBody)
};
```

### Validar Dados de Entrada

Você pode validar os dados de entrada antes de enviar a solicitação:

```javascript
// Validar o parâmetro de consulta
if (!pm.variables.has("userID")) {
    pm.variables.set("userID", "valor_padrão");
}
```

### Conclusão

Os pré-request scripts no Postman oferecem flexibilidade para executar tarefas de configuração e preparação antes de enviar solicitações de API. Com esses scripts, você pode automatizar várias etapas do processo de teste e garantir a eficiência e a precisão de suas solicitações de API no Postman.
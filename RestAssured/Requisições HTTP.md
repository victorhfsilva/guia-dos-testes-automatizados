# Rest Assured

### Envio de Requisições HTTP

#### 1. Método GET:

```java
Response response = RestAssured.get("http://url_da_api/resource");
```

#### 2. Método POST:

```java
Response response = RestAssured.post("http://url_da_api/resource");
```

#### 3. Método PUT:

```java
Response response = RestAssured.put("http://url_da_api/resource");
```

#### 4. Método DELETE:

```java
Response response = RestAssured.delete("http://url_da_api/resource");
```

#### 5. Adicionando Parâmetros à Solicitação:

```java
Response response = RestAssured.given()
    .param("key1", "value1")
    .param("key2", "value2")
    .get("http://url_da_api/resource");
```

#### 6. Adicionando Cabeçalhos à Solicitação:

```java
Response response = RestAssured.given()
    .header("Content-Type", "application/json")
    .header("Authorization", "Bearer token")
    .get("http://url_da_api/resource");
```

#### 7. Enviando Corpo da Solicitação (POST/PUT):

```java
String requestBody = "{\"key\": \"value\"}";
Response response = RestAssured.given()
    .contentType("application/json")
    .body(requestBody)
    .post("http://url_da_api/resource");
```

#### 8. Enviando Corpo da Solicitação com JSON (POST/PUT):

```java
Map<String, Object> requestBody = new HashMap<>();
requestBody.put("key1", "value1");
requestBody.put("key2", "value2");

Response response = RestAssured.given()
    .contentType("application/json")
    .body(requestBody)
    .post("http://url_da_api/resource");
```

#### 9. Enviando Corpo da Solicitação com XML (POST/PUT):

```java
String requestBody = "<root><key>value</key></root>";

Response response = RestAssured.given()
    .contentType("application/xml")
    .body(requestBody)
    .post("http://url_da_api/resource");
```
# Rest Assured

## Validação das Respostas

#### 1. Validar o Código de Status:

```java
Response response = RestAssured.get("http://url_da_api/resource");
int statusCode = response.getStatusCode();
Assert.assertEquals(statusCode, 200);
```

#### 2. Validar o Corpo da Resposta:

```java
Response response = RestAssured.get("http://url_da_api/resource");
String responseBody = response.getBody().asString();
Assert.assertTrue(responseBody.contains("expected_value"));
```

#### 3. Validar um Campo Específico no JSON da Resposta:

```java
Response response = RestAssured.get("http://url_da_api/resource");
JsonPath jsonPathEvaluator = response.jsonPath();
String specificField = jsonPathEvaluator.get("json_field_name");
Assert.assertEquals(specificField, "expected_value");
```

#### 4. Validar um Campo Específico no XML da Resposta:

```java
Response response = RestAssured.get("http://url_da_api/resource");
XmlPath xmlPathEvaluator = response.xmlPath();
String specificField = xmlPathEvaluator.get("xml_field_name");
Assert.assertEquals(specificField, "expected_value");
```

#### 5. Validar Cabeçalhos da Resposta:

```java
Response response = RestAssured.get("http://url_da_api/resource");
String contentTypeHeader = response.getHeader("Content-Type");
Assert.assertEquals(contentTypeHeader, "application/json; charset=UTF-8");
```

#### 6. Validar Tempo de Resposta:

```java
Response response = RestAssured.get("http://url_da_api/resource");
long responseTime = response.time();
Assert.assertTrue(responseTime < 5000); // Tempo de resposta inferior a 5 segundos
```

#### 7. Validar Estrutura JSON com Schema:

```java
Response response = RestAssured.get("http://url_da_api/resource");
String schema = new File("schema.json").toString();
response.then().body(JsonSchemaValidator.matchesJsonSchema(schema));
```

#### 8. Validar Estrutura XML com Schema:

```java
Response response = RestAssured.get("http://url_da_api/resource");
String schema = new File("schema.xml").toString();
response.then().body(XmlSchemaValidator.matchesXmlSchemaInClasspath(schema));
```
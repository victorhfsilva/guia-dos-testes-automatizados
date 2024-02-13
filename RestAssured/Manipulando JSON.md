# Rest Assured

## Manipulação de JSON 

#### 1. Ler e Extrair Valores de JSON:

```java
Response response = RestAssured.get("http://url_da_api/resource");
JsonPath jsonPathEvaluator = response.jsonPath();
String value = jsonPathEvaluator.get("json_field_name");
```

#### 2. Validar Existência de um Campo JSON:

```java
Response response = RestAssured.get("http://url_da_api/resource");
JsonPath jsonPathEvaluator = response.jsonPath();
Assert.assertTrue(jsonPathEvaluator.get("json_field_name") != null);
```

#### 3. Converter JSON para Objeto Java:

```java
Response response = RestAssured.get("http://url_da_api/resource");
SomeObject object = response.as(SomeObject.class);
```

#### 4. Extrair Lista de Valores de um Campo JSON:

```java
Response response = RestAssured.get("http://url_da_api/resource");
JsonPath jsonPathEvaluator = response.jsonPath();
List<String> values = jsonPathEvaluator.getList("json_field_name");
```
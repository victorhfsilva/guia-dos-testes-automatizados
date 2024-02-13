# Rest Assured 

## Manipulação de XML

#### 1. Ler e Extrair Valores de XML:

```java
Response response = RestAssured.get("http://url_da_api/resource");
XmlPath xmlPathEvaluator = response.xmlPath();
String value = xmlPathEvaluator.get("xml_field_name");
```

#### 2. Validar Existência de um Campo XML:

```java
Response response = RestAssured.get("http://url_da_api/resource");
XmlPath xmlPathEvaluator = response.xmlPath();
Assert.assertTrue(xmlPathEvaluator.get("xml_field_name") != null);
```

#### 3. Converter XML para Objeto Java:

```java
Response response = RestAssured.get("http://url_da_api/resource");
SomeObject object = response.as(SomeObject.class);
```

#### 4. Extrair Lista de Valores de um Campo XML:

```java
Response response = RestAssured.get("http://url_da_api/resource");
XmlPath xmlPathEvaluator = response.xmlPath();
List<String> values = xmlPathEvaluator.getList("xml_field_name");
```
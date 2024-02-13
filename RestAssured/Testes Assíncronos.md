# Rest ASsured

## Testes Assíncronos

#### 1. Aguardar um Tempo Específico Antes de Verificar a Resposta:

```java
RestAssured.given()
    .get("http://url_da_api/resource")
    .then()
    .assertThat()
    .statusCode(200)
    .await()
    .atMost(5, TimeUnit.SECONDS);
```

#### 2. Esperar até que um Determinado Campo Esteja Disponível na Resposta:

```java
RestAssured.given()
    .get("http://url_da_api/resource")
    .then()
    .assertThat()
    .body("json_field_name", equalTo("expected_value"))
    .await()
    .until()
    .body("json_field_name", equalTo("expected_value"));
```

#### 3. Aguardar até que um Determinado Campo Esteja Disponível na Resposta com Tempo de Espera:

```java
RestAssured.given()
    .get("http://url_da_api/resource")
    .then()
    .assertThat()
    .body("json_field_name", equalTo("expected_value"))
    .await()
    .atMost(10, TimeUnit.SECONDS)
    .until()
    .body("json_field_name", equalTo("expected_value"));
```

#### 4. Esperar até que um Determinado Número de Elementos Esteja Presente em uma Lista:

```java
RestAssured.given()
    .get("http://url_da_api/resource")
    .then()
    .assertThat()
    .body("json_list_name.size()", equalTo(3))
    .await()
    .until()
    .body("json_list_name.size()", equalTo(3));
```

#### 5. Aguardar até que um Campo JSON esteja Presente:

```java
RestAssured.given()
    .get("http://url_da_api/resource")
    .then()
    .assertThat()
    .body("json_field_name", notNullValue())
    .await()
    .until()
    .body("json_field_name", notNullValue());
```

#### 6. Aguardar até que um Campo JSON tenha um Valor Específico:

```java
RestAssured.given()
    .get("http://url_da_api/resource")
    .then()
    .assertThat()
    .body("json_field_name", equalTo("expected_value"))
    .await()
    .until()
    .body("json_field_name", equalTo("expected_value"));
```
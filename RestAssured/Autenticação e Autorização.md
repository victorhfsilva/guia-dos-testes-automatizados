# Rest Assured

## Autenticação e Autorização

#### 1. Autenticação Básica:

```java
RestAssured.given()
    .auth().basic("username", "password")
    .get("http://url_da_api/resource");
```

#### 2. Autenticação Básica com Base64 Encoded:

```java
RestAssured.given()
    .header("Authorization", "Basic " + Base64.getEncoder().encodeToString("username:password".getBytes()))
    .get("http://url_da_api/resource");
```

#### 3. Autenticação com Token:

```java
RestAssured.given()
    .header("Authorization", "Bearer token_value")
    .get("http://url_da_api/resource");
```

#### 4. Autenticação com Certificado SSL:

```java
RestAssured.given()
    .keyStore("path_to_keystore", "keystore_password")
    .get("https://url_da_api/resource");
```

#### 5. Autorização por Papel (Role-Based Authorization):

```java
RestAssured.given()
    .auth().preemptive().basic("username", "password")
    .header("Authorization", "Bearer token_value")
    .get("http://url_da_api/resource");
```

#### 6. Autorização por Função (Function-Based Authorization):

```java
RestAssured.given()
    .auth().oauth2("access_token")
    .get("http://url_da_api/resource");
```

#### 7. Autorização com Cookie:

```java
RestAssured.given()
    .cookie("cookie_name", "cookie_value")
    .get("http://url_da_api/resource");
```

#### 8. Autorização com Token JWT:

```java
RestAssured.given()
    .header("Authorization", "Bearer JWT_token")
    .get("http://url_da_api/resource");
```

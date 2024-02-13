# Rest Assured

## Configuração

### Maven:

Para adicionar o REST Assured ao seu projeto Maven, incluindo as dependências do JsonPath e XmlPath, adicione o seguinte trecho ao arquivo `pom.xml`:

```xml
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>5.4.0</version>
    <scope>test</scope>
</dependency>
```

#### JsonPath:

Para trabalhar com JsonPath, adicione a seguinte dependência ao seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>json-path</artifactId>
    <version>5.4.0</version>
    <scope>test</scope>
</dependency>
```

#### XmlPath:

Para trabalhar com XmlPath, adicione a seguinte dependência ao seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>xml-path</artifactId>
    <version>5.4.0</version>
    <scope>test</scope>
</dependency>
```

#### JSON Schema Validation:

Para realizar a validação de esquema JSON, adicione a seguinte dependência ao seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>json-schema-validator</artifactId>
    <version>5.4.0</version>
    <scope>test</scope>
</dependency>
```

#### Spring Mock Mvc:

Se você estiver utilizando o Spring Mvc e deseja testar seus controladores com o RestAssuredMockMvc, adicione a seguinte dependência ao seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>spring-mock-mvc</artifactId>
    <version>5.4.0</version>
    <scope>test</scope>
</dependency>
```

#### Spring Web Test Client:

Se você estiver utilizando o Spring Webflux e deseja testar seus controladores reativos com RestAssuredWebTestClient, adicione a seguinte dependência ao seu arquivo `pom.xml`:

```xml
<dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>spring-web-test-client</artifactId>
      <version>5.4.0</version>
      <scope>test</scope>
</dependency>
```

### Gradle:

#### Configuração do REST Assured 

Para adicionar o REST Assured ao seu projeto Gradle, incluindo as dependências do JsonPath e XmlPath, adicione o seguinte trecho ao arquivo `build.gradle`:

```groovy
testImplementation 'io.rest-assured:rest-assured:5.4.0'
```

#### JsonPath:

Para trabalhar com JsonPath, adicione a seguinte dependência ao seu arquivo `build.gradle`:

```groovy
testImplementation 'io.rest-assured:json-path:5.4.0'
```

#### XmlPath:

Para trabalhar com XmlPath, adicione a seguinte dependência ao seu arquivo `build.gradle`:

```groovy
testImplementation 'io.rest-assured:xml-path:5.4.0'
```

#### JSON Schema Validation:

Para realizar a validação de esquema JSON, adicione a seguinte dependência ao seu arquivo `build.gradle`:

```groovy
testImplementation 'io.rest-assured:json-schema-validator:5.4.0'
```

#### Spring Mock Mvc:

Se você estiver utilizando o Spring Mvc e deseja testar seus controladores com o RestAssuredMockMvc, adicione a seguinte dependência ao seu arquivo `build.gradle`:

```groovy
testImplementation 'io.rest-assured:spring-mock-mvc:5.4.0'
```

#### Spring Web Test Client:

Se você estiver utilizando o Spring Webflux e deseja testar seus controladores reativos com RestAssuredWebTestClient, adicione a seguinte dependência ao seu arquivo `pom.xml`:

```groovy
testImplementation 'io.rest-assured:spring-web-test-client:5.4.0'
```

### Notas:

- Certifique-se de que as dependências do Rest Assured, como o `rest-assured`, estão declaradas antes da dependência do JUnit no arquivo `pom.xml` ou `build.gradle` para garantir que a versão correta do Hamcrest seja utilizada.

- O Rest Assured inclui automaticamente as dependências do JsonPath e XmlPath como dependências transitivas.

Com essas configurações, você estará pronto para usar o Rest Assured em seus testes de API, seja em um projeto Maven ou Gradle. Certifique-se de ajustar as versões das dependências conforme necessário.
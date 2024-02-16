# Selenium Webdriver

## **Configuração do Selenium WebDriver**

### **1. Instalar a Biblioteca do Selenium:**

Para começar a usar o Selenium WebDriver, é necessário instalar a biblioteca correspondente à sua linguagem de programação. Vejamos como fazer isso para Java usando Maven e Gradle:

#### **Java (Maven):**

Adicione a seguinte dependência ao seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.17.0</version>
</dependency>
```

#### **Java (Gradle):**

Adicione as seguintes linhas ao arquivo `build.gradle` do seu projeto:

```gradle
testImplementation 'org.seleniumhq.selenium:selenium-java:4.17.0'
testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.10.0'
```

### **2. Escreva Seu Primeiro Script Selenium:**

Agora que você instalou a biblioteca do Selenium, vamos escrever um script simples para interagir com um navegador da web:

#### **1. Iniciar a Sessão:**

Abra uma nova instância do navegador:

```java
WebDriver driver = new ChromeDriver();
```

#### **2. Maximizar a Janela:**

Maximize a janela do navegador para garantir uma visualização adequada:

```java
driver.manage().window().maximize();
```

#### **3. Acessar uma página:**

Navegue para uma página da web específica:

```java
driver.get("https://www.selenium.dev/selenium/web/web-form.html");
```

#### **4. Obter Informações do Navegador:**

Obtenha o título da página atual:

```java
String title = driver.getTitle();
```

#### **5. Definir espera:**

Defina um tempo de espera implícito para aguardar que os elementos da página sejam carregados:

```java
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
```

#### **6. Localizar um Elemento:**

Localize um elemento na página usando diferentes estratégias de localização:

```java
WebElement textBox = driver.findElement(By.name("my-text"));
WebElement submitButton = driver.findElement(By.cssSelector("button"));
```

#### **7. Realizar Ação:**

Interaja com o elemento, como inserir texto em um campo de entrada e clicar em um botão:

```java
textBox.sendKeys("Selenium");
submitButton.click();
```

#### **8. Obter Informações:**

Obtenha informações sobre o elemento, como texto ou atributos:

```java
String messageText = message.getText();
```

#### **9. Finalizar a Sessão:**

Encerre a sessão do navegador após concluir suas operações:

```java
driver.quit();
```
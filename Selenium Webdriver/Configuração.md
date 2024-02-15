# Selenium Webdriver

## **Configuração do Selenium WebDriver**

### **1. Instalar a Biblioteca do Selenium:**

#### **Java (Maven):**

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.17.0</version>
</dependency>
```
#### **Java (Gradle):**

```gradle
testImplementation 'org.seleniumhq.selenium:selenium-java:4.17.0'
testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.10.0'
```


### **2. Escreva Seu Primeiro Script Selenium:**


#### **1. Iniciar a Sessão:**

```java
WebDriver driver = new ChromeDriver();
```

#### **2. Realizar Ação no Navegador:**

```java
driver.get("https://www.selenium.dev/selenium/web/web-form.html");
```

#### **3. Solicitar Informações do Navegador:**

```java
driver.getTitle();
```

#### **4. Estabelecer Estratégia de Espera:**

```java
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
```

#### **5. Encontrar um Elemento:**

```java
WebElement textBox = driver.findElement(By.name("my-text"));
WebElement submitButton = driver.findElement(By.cssSelector("button"));
```

#### **6. Realizar Ação no Elemento:**

```java
textBox.sendKeys("Selenium");
submitButton.click();
```

#### **7. Solicitar Informações do Elemento:**

```java
message.getText();
```

#### **8. Finalizar a Sessão:**

```java
driver.quit();
```

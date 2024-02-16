# Selenium Webdriver

## Localização de Elementos: **

### **Estratégias de Localização:**

Existem várias estratégias para localizar elementos em uma página da web usando Selenium WebDriver:

#### **Por ID:** 
  
```html
<input type="text" id="elementId" name="username">
```
  
```java
WebElement element = driver.findElement(By.id("elementId"));
```

#### **Por Nome:**
  
```html
<input type="text" name="elementName" class="form-control">
```
  
```java
WebElement element = driver.findElement(By.name("elementName"));
```

#### **Por Classe CSS:**
  
```html
<button class="btn btn-primary">Submit</button>
```
  
```java
WebElement element = driver.findElement(By.className("btn-primary"));
```

#### **Por Seletor CSS:**
  
```html
<p class="description">Lorem ipsum dolor sit amet.</p>
```
  
```java
WebElement element = driver.findElement(By.cssSelector(".description"));
```

#### **Por XPath:**
  
```html
<span class="error" xpath="1">Invalid username</span>
```
  
```java
WebElement element = driver.findElement(By.xpath("//span[@class='error']"));
```

#### **Por Link Text:**
  
```html
<a href="https://www.example.com">Click here</a>
```
  
```java
WebElement element = driver.findElement(By.linkText("Click here"));
```

#### **Por Partial Link Text:**
  
```html
<a href="https://www.example.com">Click here to continue</a>
```
  
```java
WebElement element = driver.findElement(By.partialLinkText("Continue"));
```

### **Localizar Múltiplos Elementos:**

Para localizar múltiplos elementos que correspondem ao seletor fornecido, use `findElements`:

```java
List<WebElement> elements = driver.findElements(By.cssSelector("cssSelector"));
```

### **Trabalhando com Elementos Aninhados:**

Para localizar elementos dentro de um elemento pai, use `findElement` ou `findElements` a partir do elemento pai:

```java
WebElement parentElement = driver.findElement(By.id("parentId"));
WebElement childElement = parentElement.findElement(By.cssSelector("cssSelector"));
```

### **Utilizando Esperas:**

Às vezes, os elementos podem não estar imediatamente disponíveis. Use esperas implícitas ou explícitas para lidar com isso:

#### **Espera Implícita:**
  ```java
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  ```

#### **Espera Explícita:**
  ```java
  WebDriverWait wait = new WebDriverWait(driver, 10);
  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
  ```
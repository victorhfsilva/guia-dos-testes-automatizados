# Selenium Webdriver

## **Interagindo com Elementos:**

Depois de localizar os elementos na página da web usando Selenium WebDriver, você pode interagir com eles de várias maneiras:

#### **Enviar Texto para um Campo de Entrada:**

```java
WebElement usernameField = driver.findElement(By.id("username"));
usernameField.sendKeys("user123");
```

#### **Clicar em um Botão:**

```java
WebElement submitButton = driver.findElement(By.id("submit"));
submitButton.click();
```

#### **Limpar o Conteúdo de um Campo de Entrada:**

```java
WebElement searchField = driver.findElement(By.name("search"));
searchField.clear();
```

#### **Obter Texto de um Elemento:**

```java
WebElement welcomeMessage = driver.findElement(By.className("welcome"));
String messageText = welcomeMessage.getText();
```

#### **Verificar se um Elemento está Visível:**

```java
WebElement errorMessage = driver.findElement(By.id("error"));
boolean isVisible = errorMessage.isDisplayed();
```

#### **Verificar se um Elemento está Habilitado:**

```java
WebElement submitButton = driver.findElement(By.id("submit"));
boolean isEnabled = submitButton.isEnabled();
```

#### **Selecionar uma Opção de um Dropdown:**

```java
WebElement dropdown = driver.findElement(By.id("dropdown"));
Select select = new Select(dropdown);
select.selectByVisibleText("Option 1");
```

#### **Trabalhar com Checkboxes e Radio Buttons:**

```java
WebElement checkbox = driver.findElement(By.id("checkbox"));
checkbox.click();

WebElement radioButton = driver.findElement(By.id("radioButton"));
radioButton.click();
```

#### **Executar Ações de Teclado:**

```java
Actions actions = new Actions(driver);
actions.sendKeys(Keys.ENTER).perform();
```

#### **Mover o Mouse sobre um Elemento:**

```java
WebElement element = driver.findElement(By.id("element"));
Actions actions = new Actions(driver);
actions.moveToElement(element).perform();
```

#### **Arrastar e Soltar Elementos:**

```java
WebElement source = driver.findElement(By.id("source"));
WebElement target = driver.findElement(By.id("target"));
Actions actions = new Actions(driver);
actions.dragAndDrop(source, target).perform();
```

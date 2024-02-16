# Selenium Webdriver

## **Esperas:**

Quando se trata de automação de testes com Selenium WebDriver, a espera é uma parte crucial para lidar com a sincronização entre o teste e a aplicação web. Existem duas formas principais de espera: implícita e explícita.

### **Espera Implícita:**

A espera implícita é definida uma vez e aplicada a todas as operações de busca de elementos. O Selenium esperará por um determinado período de tempo antes de lançar uma exceção de `NoSuchElementException`. 

```java
// Definir espera implícita para 10 segundos
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
```

### **Espera Explícita:**

A espera explícita é usada para aguardar uma condição específica antes de prosseguir com a execução do teste. Ela é aplicada apenas a um determinado elemento em uma operação específica.

```java
// Aguardar até que o elemento esteja visível por até 10 segundos
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
```

#### **Espera de Presença de Elemento:**

Espera até que o elemento esteja presente na página.

```java
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("elementId")));
```

#### **Espera de Visibilidade do Elemento:**

Espera até que o elemento esteja visível na página.

```java
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
```

#### **Espera de Elemento Clicável:**

Espera até que o elemento seja clicável.

```java
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
```

#### **Espera de Texto do Elemento:**

Espera até que o texto do elemento seja igual ao texto esperado.

```java
WebDriverWait wait = new WebDriverWait(driver, 10);
boolean result = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("elementId"), "Expected Text"));
```

#### **Espera de Título da Página:**

Espera até que o título da página seja igual ao título esperado.

```java
WebDriverWait wait = new WebDriverWait(driver, 10);
boolean result = wait.until(ExpectedConditions.titleIs("Expected Title"));
```
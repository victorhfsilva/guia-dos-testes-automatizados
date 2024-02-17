# Selenium Webdriver

## **Actions no Selenium WebDriver:**

As Actions no Selenium WebDriver são usadas para realizar interações complexas com elementos da interface do usuário, como mouse e teclado. 


#### **1. Movendo o Mouse para um Elemento:**

```java
Actions actions = new Actions(driver);
WebElement element = driver.findElement(By.id("elementId"));
actions.moveToElement(element).perform();
```

#### **2. Clicando em um Elemento:**

```java
actions.click(element).perform();
```

#### **3. Duplo Clique em um Elemento:**

```java
actions.doubleClick(element).perform();
```

#### **4. Clique com o Botão Direito do Mouse em um Elemento:**

```java
actions.contextClick(element).perform();
```

#### **5. Arrastar e Soltar:**

```java
WebElement sourceElement = driver.findElement(By.id("sourceElementId"));
WebElement targetElement = driver.findElement(By.id("targetElementId"));
actions.dragAndDrop(sourceElement, targetElement).perform();
```

#### **6. Arrastar e Soltar por um Deslocamento:**

```java
actions.dragAndDropBy(sourceElement, xOffset, yOffset).perform();
```

#### **7. Pressionar uma Tecla do Teclado:**

```java
actions.sendKeys(Keys.ENTER).perform();
```

#### **8. Pressionar Teclas Modificadoras (Ctrl, Shift, Alt):**

```java
actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
```

#### **9. Realizar uma Sequência de Ações:**

```java
actions.moveToElement(element)
       .click()
       .sendKeys("texto")
       .build()
       .perform();
```

#### **10. Executar uma Ação Compensatória:**

```java
actions.moveToElement(element).contextClick().perform();
actions.release().perform();
```

#### **Observações Importantes:**

- As Actions permitem simular interações complexas do usuário, como movimentos do mouse e operações de teclado.
- Sempre chame o método `perform()` para executar as ações após defini-las.
- As Actions são úteis para testar funcionalidades interativas em aplicativos da web, como arrastar e soltar, hover e teclas de atalho.

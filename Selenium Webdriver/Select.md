# Selenium Webdriver

### **Select no Selenium WebDriver**

A classe Select no Selenium WebDriver é utilizada para interagir com elementos do tipo dropdown (select/option) em páginas web.

#### **1. Importando a Classe Select:**

```java
import org.openqa.selenium.support.ui.Select;
```

#### **2. Instanciando um Objeto Select:**

```java
WebElement dropdown = driver.findElement(By.id("dropdownId"));
Select select = new Select(dropdown);
```

#### **3. Selecionando uma Opção por Índice:**

```java
select.selectByIndex(2); // Seleciona a terceira opção (índice 2)
```

#### **4. Selecionando uma Opção por Valor:**

```java
select.selectByValue("value"); // Seleciona a opção com o atributo 'value' especificado
```

#### **5. Selecionando uma Opção por Texto Visível:**

```java
select.selectByVisibleText("Texto visível da opção"); // Seleciona a opção com o texto visível especificado
```

#### **6. Verificando se uma Opção está Selecionada:**

```java
boolean isSelected = select.getFirstSelectedOption().isSelected();
```

#### **7. Obtendo Todas as Opções Disponíveis:**

```java
List<WebElement> options = select.getOptions(); // Retorna todas as opções disponíveis no dropdown
```

#### **8. Obtendo Todas as Opções Selecionadas:**

```java
List<WebElement> selectedOptions = select.getAllSelectedOptions(); // Retorna todas as opções atualmente selecionadas
```

#### **9. Desmarcando Todas as Opções Selecionadas:**

```java
select.deselectAll(); // Desmarca todas as opções previamente selecionadas
```

#### **10. Desmarcando uma Opção por Índice, Valor ou Texto:**

```java
select.deselectByIndex(2); // Desmarca a terceira opção (índice 2)
select.deselectByValue("value"); // Desmarca a opção com o atributo 'value' especificado
select.deselectByVisibleText("Texto visível da opção"); // Desmarca a opção com o texto visível especificado
```

#### **Observações Importantes:**

- Certifique-se de que o elemento em que está tentando interagir seja um elemento do tipo dropdown (select/option).
- As operações de seleção e desseleção só funcionarão em elementos que permitam múltiplas seleções se o elemento `<select>` tiver o atributo `multiple`.
- Antes de chamar métodos de seleção ou desseleção, verifique se o dropdown está disponível e visível na página.
# Selenium Webdriver

## **Alertas no Selenium WebDriver:**

Os alertas são pequenas caixas de diálogo que aparecem na interface do usuário para fornecer informações importantes ou solicitar ações do usuário. O Selenium WebDriver oferece suporte para manipulação de alertas durante a automação de testes.

#### **1. Aceitando um Alerta:**

```java
// Aceita o alerta (clica no botão "OK")
driver.switchTo().alert().accept();
```

#### **2. Recusando um Alerta:**

```java
// Recusa o alerta (clica no botão "Cancelar")
driver.switchTo().alert().dismiss();
```

#### **3. Obtendo Texto de um Alerta:**

```java
// Obtém o texto do alerta
String alertText = driver.switchTo().alert().getText();
```

#### **4. Enviando Texto para um Prompt:**

```java
// Envia texto para o prompt e, em seguida, aceita o alerta
driver.switchTo().alert().sendKeys("Texto a ser enviado");
driver.switchTo().alert().accept();
```

#### **5. Verificando a Presença de um Alerta:**

```java
// Verifica se um alerta está presente
boolean isAlertPresent = ExpectedConditions.alertIsPresent().apply(driver) != null;
```

#### **Observações Importantes:**

- Os alertas podem aparecer em diferentes momentos durante a execução de um teste, portanto, é importante lidar com eles adequadamente para garantir o fluxo correto do teste.
- Certifique-se de entender o comportamento esperado do alerta (aceitar, recusar ou fornecer entrada) para manipulá-lo corretamente em seu teste.

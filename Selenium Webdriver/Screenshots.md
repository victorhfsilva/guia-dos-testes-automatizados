# Selenium Webdriver

## **Captura de Screenshots no Selenium WebDriver:**

Capturar screenshots é uma prática útil durante a automação de testes para verificar visualmente o estado da aplicação em momentos específicos. O Selenium WebDriver oferece suporte para tirar screenshots da página web em que está sendo executado.

#### **1. Tirar uma Screenshot da Página Atual:**

```java
// Tirar uma screenshot da página atual e salvar como arquivo
File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile, new File("caminho/para/o/arquivo/screenshot.png"));
```

#### **2. Tirar uma Screenshot de um Elemento Específico:**

```java
// Encontrar um elemento na página e tirar uma screenshot apenas desse elemento
WebElement element = driver.findElement(By.id("elementId"));
File screenshotFile = element.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile, new File("caminho/para/o/arquivo/screenshot_elemento.png"));
```

#### **Observações Importantes:**

- Certifique-se de incluir a biblioteca adequada para manipulação de arquivos, como o `FileUtils` da biblioteca Apache Commons IO.
- Ao tirar screenshots, forneça caminhos de arquivo válidos e certifique-se de ter permissão para escrever nos diretórios especificados.
- A captura de screenshots é útil para depuração de testes, registro de evidências visuais e análise de falhas.

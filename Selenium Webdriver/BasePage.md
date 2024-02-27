# Selenium Webdriver

## Escrevendo BasePages:

A `BasePage` é uma classe fundamental em estruturas de automação de testes no Selenium WebDriver. Ela encapsula funcionalidades comuns e fornece uma camada de abstração para interações comuns com o navegador e elementos da página.

#### **1. Inicialização do WebDriver:**

```java
public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
```

- Atributo `driver`: Instância do WebDriver para interagir com o navegador.

#### **2. Métodos de Navegação:**

```java
public void openPage(String url) {
    driver.get(url);
}

public void goBack() {
    driver.navigate().back();
}

public void refreshPage() {
    driver.navigate().refresh();
}
```

- `openPage`: Abre uma URL específica.
- `goBack`: Retorna para a página anterior.
- `refreshPage`: Atualiza a página atual.

#### **3. Esperas Explícitas:**

```java
public class BasePage {
    // código anterior

    public void waitForElementToBeClickable(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
```

- `waitForElementToBeClickable`: Aguarda até que um elemento seja clicável.

#### **4. Captura de Screenshots:**

```java
public class BasePage {
    // código anterior

    public void takeScreenshot(String fileName) {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File(fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

- `takeScreenshot`: Captura um screenshot da página.

#### **5. Manipulação de Cookies:**

```java
public class BasePage {
    // código anterior

    public void addCookie(String name, String value) {
        Cookie cookie = new Cookie(name, value);
        driver.manage().addCookie(cookie);
    }

    public void deleteCookie(String name) {
        driver.manage().deleteCookieNamed(name);
    }

    public String getCookieValue(String name) {
        return driver.manage().getCookieNamed(name).getValue();
    }
}
```

- `addCookie`: Adiciona um cookie.
- `deleteCookie`: Exclui um cookie.
- `getCookieValue`: Obtém o valor de um cookie.

### Considerações Finais:

- **Reutilização de Código:** A `BasePage` promove a reutilização de código ao encapsular funcionalidades comuns.
- **Manutenibilidade:** Mantenha a `BasePage` organizada e coesa para facilitar a manutenção e extensão do código.
- **Abstração:** A `BasePage` fornece uma abstração para interações comuns com o navegador e elementos da página, tornando o código de automação mais legível e modular.
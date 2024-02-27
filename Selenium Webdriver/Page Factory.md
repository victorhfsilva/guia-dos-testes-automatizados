# Selenium WebDriver

## **Page Factory**

O padrão de projeto Page Factory é uma abordagem utilizada no Selenium WebDriver para melhorar a manutenibilidade e a legibilidade dos testes de automação, separando a lógica de teste da lógica de localização e inicialização dos elementos da página.

### **Anotações da Page Factory:**

Utilize as anotações fornecidas pelo Selenium WebDriver para inicializar elementos da página.

Exemplo de anotações:
```java
@FindBy(id = "username")
private WebElement usernameField;

@FindBy(id = "password")
private WebElement passwordField;

@FindBy(id = "loginBtn")
private WebElement loginButton;
```

### Parâmetros da Anotação @FindBy:

1. **id**:
   - `@FindBy(id = "elementId")`
   - Localiza um elemento pelo atributo `id`.

2. **name**:
   - `@FindBy(name = "elementName")`
   - Localiza um elemento pelo atributo `name`.

3. **className**:
   - `@FindBy(className = "elementClassName")`
   - Localiza um elemento pelo atributo `class`.

4. **tagName**:
   - `@FindBy(tagName = "tagname")`
   - Localiza um elemento pelo nome da tag HTML.

5. **linkText**:
   - `@FindBy(linkText = "linkText")`
   - Localiza um link pelo texto do link exato.

6. **partialLinkText**:
   - `@FindBy(partialLinkText = "partialLinkText")`
   - Localiza um link pelo texto parcial do link.

7. **css**:
   - `@FindBy(css = "cssSelector")`
   - Localiza um elemento usando um seletor CSS.

8. **xpath**:
   - `@FindBy(xpath = "xpathExpression")`
   - Localiza um elemento usando uma expressão XPath.

#### Exemplos de Uso:

```java
@FindBy(id = "username")
private WebElement usernameField;

@FindBy(name = "password")
private WebElement passwordField;

@FindBy(className = "login-button")
private WebElement loginButton;

@FindBy(tagName = "a")
private WebElement linkElement;

@FindBy(linkText = "Login")
private WebElement loginLink;

@FindBy(partialLinkText = "Forgot")
private WebElement forgotPasswordLink;

@FindBy(css = "input[type='submit']")
private WebElement submitButton;

@FindBy(xpath = "//input[@id='username']")
private WebElement usernameInput;
```

### **Inicializando os Elementos da Página:**

Inicialize os elementos da página usando a classe PageFactory.

*Exemplo de inicialização:*
```java
public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
```

### **Criando Métodos de Ação:**

Em cada classe de página, crie métodos para interagir com os elementos da página, usando as variáveis inicializadas pela Page Factory.

```java
public void setUsername(String username) {
    usernameField.sendKeys(username);
}

public void setPassword(String password) {
    passwordField.sendKeys(password);
}

public void clickLoginButton() {
    loginButton.click();
}
```

### **Criando Testes Utilizando as Classes de Página:**

Nos testes de automação, instancie as classes de página e use os métodos de ação para realizar as interações com os elementos da página.

Exemplo de teste:
```java
@Test
public void loginTest() {
    LoginPage loginPage = new LoginPage(driver);
    driver.get("https://www.example.com/login");
    loginPage.setUsername("user123");
    loginPage.setPassword("pass123");
    loginPage.clickLoginButton();
    // Adicione asserções e verificações aqui
}
```

### **Vantagens da Page Factory:**

- **Legibilidade:** Simplifica a lógica de inicialização e localização de elementos, tornando o código mais claro e fácil de entender.
  
- **Manutenibilidade:** Facilita a manutenção do código, pois centraliza a localização dos elementos da página em um único local.
  
- **Reutilização:** Permite a reutilização dos elementos da página em vários testes, evitando a duplicação de código.

Aqui está um cheatsheet sobre os parâmetros que a anotação `FindBy` aceita no Selenium WebDriver:

### Exemplo:

*Login Page:*
```java
public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginBtn")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
```

*Login Test:*
```java
public class LoginTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() {
        // Abrir a página de login
        driver.get("https://www.example.com/login");

        // Instanciar a página de login
        LoginPage loginPage = new LoginPage(driver);

        // Preencher credenciais e fazer login
        loginPage.setUsername("user123");
        loginPage.setPassword("pass123");
        loginPage.clickLoginButton();

        // Adicionar asserções e verificações aqui
    }

    @AfterTest
    public void tearDown() {
        // Fechar o navegador
        driver.quit();
    }
```

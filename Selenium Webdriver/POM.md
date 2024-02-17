# Selenium Webdriver

## **Page Object Model (POM) no Selenium WebDriver:**

O padrão de projeto Page Object Model (POM) é uma abordagem popular para organizar e manter os elementos da interface do usuário e as interações com eles em páginas separadas em seu código de automação. 

#### **1. Criando Classes de Página:**

Crie uma classe para cada página ou componente da interface do usuário. Essas classes devem representar os elementos da página e as interações com eles.

Exemplo:

```java
public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginBtn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
```

#### **2. Criando Métodos de Ação:**

Em cada classe de página, crie métodos para interagir com os elementos da página. Isso mantém o código de automação desacoplado dos detalhes de implementação da página.

#### **3. Criando Testes Utilizando as Classes de Página:**

Nos testes de automação, instancie as classes de página e use os métodos de ação para realizar as interações com os elementos da página.

Exemplo:

```java
public class LoginTest {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void loginTest() {
        driver.get("https://www.example.com/login");
        loginPage.setUsername("user123");
        loginPage.setPassword("pass123");
        loginPage.clickLoginButton();
        // Adicione asserções e verificações aqui
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
```

#### **4. Reutilizando os Métodos de Ação:**

Os métodos de ação em classes de página podem ser reutilizados em vários testes, reduzindo a duplicação de código e facilitando a manutenção.

#### **5. Separando Lógica de Teste e Lógica de Página:**

O POM separa a lógica de teste da lógica de página, tornando o código mais organizado, legível e fácil de manter.

#### **6. Adaptando o POM para Cada Projeto:**

Adapte o POM conforme necessário para atender aos requisitos específicos do seu projeto, adicionando métodos e classes conforme necessário.

#### **Observações Importantes:**

- O POM é uma prática recomendada para estruturar projetos de automação de teste de forma organizada e escalável.
- Mantenha as classes de página e os testes separados para garantir a modularidade e a reutilização do código.

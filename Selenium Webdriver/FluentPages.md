# Selenium Webdriver

## Fluent Pages:

Fluent Pages é uma abordagem para modelar páginas da web e interações com elementos de forma mais fluida e expressiva, utilizando métodos encadeados para realizar ações e acessar elementos da página.

### **Conceito Básico:**

Em Fluent Pages, cada página da web é representada por uma classe que encapsula os elementos da página e as ações que podem ser realizadas nela. Os métodos são encadeados para formar uma sequência lógica de interações.

### **Exemplo de Implementação:**

```java
public class LoginPage extends BasePage {
    public LoginPage navigateTo() {
        driver.get("https://www.example.com/login");
        return this;
    }

    public LoginPage enterUsername(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    public DashboardPage clickLoginButton() {
        driver.findElement(By.id("loginBtn")).click();
        return new DashboardPage(driver);
    }
}
```

### **Utilizando Fluent Pages nos Testes:**

No teste de automação, os métodos da Fluent Page podem ser encadeados em uma sequência lógica para realizar as interações desejadas com a página da web.

Exemplo:
```java
@Test
public void loginTest() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.navigateTo()
             .enterUsername("user123")
             .enterPassword("pass123")
             .clickLoginButton();

    // Adicione asserções e verificações aqui
}
```

### **Vantagens do Fluent Pages:**

- **Legibilidade Melhorada:** O encadeamento de métodos resulta em código de automação mais claro e expressivo.
  
- **Manutenibilidade Aprimorada:** Os métodos encadeados facilitam a adição, remoção ou modificação de interações com elementos da página.

- **Reutilização Simplificada:** Os métodos encadeados podem ser facilmente reutilizados em vários testes, promovendo a modularidade do código.

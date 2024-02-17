package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutheticationPage {

    private WebDriver driver;

    private By registerEmail = By.id("email_create");
    private By registerButton = By.id("SubmitCreate");
    private By loginEmail = By.id("email");
    private By loginPassword = By.id("passwd");
    private By loginButton = By.id("SubmitLogin");

    public AutheticationPage(WebDriver driver){
        this.driver = driver;
    }

    public void setRegisterEmail(String email){
        driver.findElement(registerEmail).sendKeys(email);
    }

    public void clickRegister(){
        driver.findElement(registerButton).click();
    }

    public void setLoginEmail(String email) {
        driver.findElement(loginEmail).sendKeys(email);
    }

    public void setLoginPassword(String password) {
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
}

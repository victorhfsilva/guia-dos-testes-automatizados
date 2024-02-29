package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutheticationPage extends BasePage{

    @FindBy(id = "email_create")
    private WebElement registerEmail;

    @FindBy(id = "SubmitCreate")
    private WebElement registerButton;

    @FindBy(id = "email")
    private WebElement loginEmail;

    @FindBy(id = "passwd")
    private WebElement loginPassword;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    public AutheticationPage(WebDriver driver){
       super(driver);
        PageFactory.initElements(driver, this);
    }

    public AutheticationPage navigateTo() {
        this.driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        return this;
    }

    public AutheticationPage setRegisterEmail(String email){
       registerEmail.sendKeys(email);
       return this;
    }

    public RegisterPage clickRegister(){
        registerButton.click();
        return new RegisterPage(driver);
    }

    public AutheticationPage setLoginEmail(String email) {
        loginEmail.sendKeys(email);
        return this;
    }

    public AutheticationPage setLoginPassword(String password) {
        loginPassword.sendKeys(password);
        return this;
    }

    public void clickLogin(){
        loginButton.click();
    }


    public WebElement getRegisterEmail() {
        return this.registerEmail;
    }

    public WebElement getRegisterButton() {
        return this.registerButton;
    }

    public WebElement getLoginEmail() {
        return this.loginEmail;
    }


    public WebElement getLoginPassword() {
        return this.loginPassword;
    }


    public WebElement getLoginButton() {
        return this.loginButton;
    }

}

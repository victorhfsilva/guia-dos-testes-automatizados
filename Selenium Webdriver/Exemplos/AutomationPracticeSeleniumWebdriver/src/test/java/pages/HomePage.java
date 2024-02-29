package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(partialLinkText = "PrestaShop")
    private WebElement footer;

    @FindBy(partialLinkText =  "Sign in")
    private WebElement signInButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HomePage navigateTo(){
        driver.get("http://www.automationpractice.pl/index.php");
        return this;
    }

    public void clickFooter(){
        footer.click();
    }

    public AutheticationPage clickSignInButton(){
        signInButton.click();
        return new AutheticationPage(driver);
    }

    public WebElement getFooter() {
        return this.footer;
    }

    public WebElement getSignInButton() {
        return this.signInButton;
    }
}

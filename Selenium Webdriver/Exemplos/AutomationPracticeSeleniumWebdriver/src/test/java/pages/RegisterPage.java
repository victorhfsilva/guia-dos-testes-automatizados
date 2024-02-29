package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {


    @FindBy(id = "uniform-id_gender1")
    private WebElement maleGender;

    @FindBy(id = "uniform-id_gender2")
    private WebElement femaleGender;

    @FindBy(id = "customer_firstname")
    private WebElement firstName;

    @FindBy(id = "customer_lastname")
    private WebElement lastName;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement dayOfBirth;

    @FindBy(id = "months")
    private WebElement monthOfBirth;

    @FindBy(id = "years")
    private WebElement yearOfBirth;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public RegisterPage selectMaleGender() {
        maleGender.click();
        return this;
    }

    public RegisterPage selectFemaleGender() {
        femaleGender.click();
        return this;
    }

    public RegisterPage setFirstName(String firstNameText) {
        firstName.sendKeys(firstNameText);
        return this;
    }


    public RegisterPage setLastName(String lastNameText) {
        lastName.sendKeys(lastNameText);
        return this;
    }

    public RegisterPage setEmail(String emailText) {
        email.sendKeys(emailText);
        return this;
    }

    public RegisterPage setPassword(String passwordText) {
        password.sendKeys(passwordText);
        return this;
    }

    public RegisterPage selectDayOfBirth(String day) {
        Select dayDropdown = new Select(dayOfBirth);
        dayDropdown.selectByValue(day);
        return this;
    }

    public RegisterPage selectMonthOfBirth(String month) {
        Select monthDropdown = new Select(monthOfBirth);
        monthDropdown.selectByValue(month);
        return this;
    }

    public RegisterPage selectYearOfBirth(String year) {
        Select yearDropdown = new Select(yearOfBirth);
        yearDropdown.selectByValue(year);
        return this;
    }

    public MyAccountPage clickRegisterButton() {
        registerButton.click();
        return new MyAccountPage(driver);
    }
}

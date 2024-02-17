package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private WebDriver driver;

    private By maleGender = By.id("uniform-id_gender1");
    private By femaleGender = By.id("uniform-id_gender2");
    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By email = By.id("email");
    private By password = By.id("passwd");
    private By dayOfBirth = By.id("days");
    private By monthOfBirth = By.id("months");
    private By yearOfBirth = By.id("years");
    private By registerButton = By.id("submitAccount");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectMaleGender() {
        driver.findElement(maleGender).click();
    }

    public void selectFemaleGender() {
        driver.findElement(femaleGender).click();
    }

    public void setFirstName(String firstNameText) {
        driver.findElement(firstName).sendKeys(firstNameText);
    }

    public void setLastName(String lastNameText) {
        driver.findElement(lastName).sendKeys(lastNameText);
    }

    public void setEmail(String emailText) {
        driver.findElement(email).sendKeys(emailText);
    }

    public void setPassword(String passwordText) {
        driver.findElement(password).sendKeys(passwordText);
    }

    public void selectDayOfBirth(String day) {
        Select dayDropdown = new Select(driver.findElement(dayOfBirth));
        dayDropdown.selectByValue(day);
    }

    public void selectMonthOfBirth(String month) {
        Select monthDropdown = new Select(driver.findElement(monthOfBirth));
        monthDropdown.selectByValue(month);
    }

    public void selectYearOfBirth(String year) {
        Select yearDropdown = new Select(driver.findElement(yearOfBirth));
        yearDropdown.selectByValue(year);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
}

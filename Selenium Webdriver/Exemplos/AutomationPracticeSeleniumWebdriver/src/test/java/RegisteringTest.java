import com.github.javafaker.Faker;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AutheticationPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterPage;
import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RegisteringTest {

    private final static  WebDriver driver = new ChromeDriver();
    private final static HomePage homePage = new HomePage(driver);
    private final static AutheticationPage autheticationPage = new AutheticationPage(driver);
    private final static RegisterPage registerPage = new RegisterPage(driver);
    private final static MyAccountPage myAccountPage = new MyAccountPage(driver);

    private final Faker faker = new Faker();

    @BeforeAll
    public static void setup() {
       homePage.navigateTo()
                .clickSignInButton()
                .maximize()
                .waitForTitleContains("Login", Duration.ofSeconds(10));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    @Order(1)
    void registerTest(){

        String registerUrl = "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account#account-creation";

        autheticationPage.setRegisterEmail(faker.internet().safeEmailAddress())
                            .clickRegister()
                            .waitUrlToBe(registerUrl, Duration.ofSeconds(10));

        Assertions.assertEquals(registerUrl, driver.getCurrentUrl());

        String accountUrl = "http://www.automationpractice.pl/index.php?controller=my-account";

        registerPage.selectMaleGender()
                    .setFirstName(faker.name().firstName())
                    .setLastName(faker.name().lastName())
                    .setPassword("letmein123")
                    .selectDayOfBirth("1")
                    .selectMonthOfBirth("1")
                    .selectYearOfBirth("2000")
                    .clickRegisterButton()
                    .waitUrlToBe(accountUrl, Duration.ofSeconds(10));

        Assertions.assertEquals(accountUrl, driver.getCurrentUrl());

        WebElement welcome = myAccountPage.getWelcomeInfo();
        Assertions.assertTrue(welcome.isDisplayed());
    }

}

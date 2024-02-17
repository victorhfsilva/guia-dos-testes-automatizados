import com.github.javafaker.Faker;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AutheticationPage;
import pages.RegisterPage;

import java.time.Duration;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AuthenticationTest {

    private static final WebDriver driver = new ChromeDriver();
    private final AutheticationPage autheticationPage = new AutheticationPage(driver);
    final RegisterPage registerPage = new RegisterPage(driver);
    Faker faker = new Faker();

    @BeforeAll
    public static void setup() {
        driver.get("http://www.automationpractice.pl/index.php");

        driver.manage().window().maximize();

        WebElement signIn = driver.findElement(By.partialLinkText("Sign in"));
        signIn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.titleContains("Login"));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    @Order(1)
    public void registerTest(){
        autheticationPage.setRegisterEmail(faker.internet().safeEmailAddress());
        autheticationPage.clickRegister();

        String registerUrl = "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account#account-creation";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.urlToBe(registerUrl));

        Assertions.assertEquals(registerUrl, driver.getCurrentUrl());

        registerPage.selectMaleGender();
        registerPage.setFirstName(faker.name().firstName());
        registerPage.setLastName(faker.name().lastName());
        registerPage.setPassword("letmein123");
        registerPage.selectDayOfBirth("1");
        registerPage.selectMonthOfBirth("1");
        registerPage.selectYearOfBirth("2000");

        registerPage.clickRegisterButton();

        String accountUrl = "http://www.automationpractice.pl/index.php?controller=my-account";

        wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.urlToBe(accountUrl));

        Assertions.assertEquals(accountUrl, driver.getCurrentUrl());

        WebElement welcome = driver.findElement(By.className("info-account"));
        Assertions.assertTrue(welcome.isDisplayed());
    }
    
}

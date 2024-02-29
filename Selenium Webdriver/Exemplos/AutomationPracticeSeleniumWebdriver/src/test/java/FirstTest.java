import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FirstTest {
    private static final WebDriver driver = new ChromeDriver();
    
    private static final HomePage homePage = new HomePage(driver);

    @BeforeAll
    public static void setup() {
        homePage.maximize();
        homePage.navigateTo();
        homePage.wait(Duration.ofSeconds(10));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    @Order(1)
    void assertTitleIsCorrect() {
        String title = driver.getTitle();
        Assertions.assertEquals("My Shop", title);
    }

    @Test
    @Order(2)
    void assertFooterIsCorrect() {
        String footerText = homePage.getFooter().getText();
        Assertions.assertTrue(footerText.contains("Ecommerce software by PrestaShop"));
    }

    @Test
    @Order(3)
    void assertFooterLinkToTheRightPage() {
        homePage.clickFooter();
        homePage.wait(Duration.ofSeconds(10));
        homePage.switchToWindow("PrestaShop");
        Assertions.assertEquals("https://prestashop.com/", driver.getCurrentUrl());
    }


}

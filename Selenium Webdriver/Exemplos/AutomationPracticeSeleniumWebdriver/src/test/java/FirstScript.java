import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FirstScript {
    static final WebDriver driver = new ChromeDriver();
    @BeforeAll
    public static void setup() {
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    @Order(1)
    public void assertTitleIsCorrect() {
        String title = driver.getTitle();
        Assertions.assertEquals("My Shop", title);
    }

    @Test
    @Order(2)
    void assertFooterIsCorrect() {
        WebElement footer = driver.findElement(By.partialLinkText("PrestaShop"));
        String footerText = footer.getText();
        Assertions.assertEquals("Ecommerce software by PrestaShop™", footerText);
    }

    @Test
    @Order(3)
    void assertFooterLinkToTheRightPage() {
        WebElement footer = driver.findElement(By.partialLinkText("PrestaShop"));
        footer.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Set<String> windowHandles = driver.getWindowHandles();

        String desiredWindowHandle = windowHandles.stream()
                .filter(handle -> driver.switchTo().window(handle).getTitle().contains("PrestaShop"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Janela desejada não encontrada"));

        driver.switchTo().window(desiredWindowHandle);

        Assertions.assertEquals("https://prestashop.com/", driver.getCurrentUrl());
    }


}

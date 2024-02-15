import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.automationpractice.pl/index.php");

        String title = driver.getTitle();

        Assertions.assertEquals("My Shop", title);

        driver.quit();
    }
}

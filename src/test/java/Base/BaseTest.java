package Base;

import Pages.HomePage;
import Pages.PageSidebar;
import Pages.TextBoxPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver; // inicijalizujemo driver
    public static WebDriverWait wait; // inicijalizujemo cekanje za eksplicitni wait
    public static HomePage homePage;
    public static PageSidebar pageSidebar;
    public static TextBoxPage textBoxPage;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup(); // setujemo WebDriver, ali da bi bio vidiljiv u drugim kalsama, driver mora van metode...
        driver = new ChromeDriver(); // dodeljujemo vrednost tj. deklarisemo driver
        wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // deklarisemo cekanje za eksplicitni wait.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicitno cekanje (Thread sleep koji se prekine pojavljivanjem webelementa).

        homePage = new HomePage(driver, wait);
        pageSidebar = new PageSidebar(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);
    }
}

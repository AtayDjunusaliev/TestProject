import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by ataydjunusaliev on 9/5/17.
 */
public class LoginPositiveTest {
    WebDriver driver;
    String baseURL;

    public LoginPositiveTest() {
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        this.baseURL = "https://www.co.dakota.mn.us/libraries";
    }

    @AfterClass
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    public void login() {
        this.driver.get(this.baseURL);
        HomePage login = new HomePage(this.driver);
        login.typeCardNumber();
        login.typePinNumber();
        login.clickSubmitButton();
    }
}



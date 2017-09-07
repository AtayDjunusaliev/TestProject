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


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        baseURL = "https://www.co.dakota.mn.us/libraries";
    }

    @AfterClass
    public void tearDown() {
       driver.quit();
    }

    @Test
    public void login() {
        driver.get(baseURL);
        HomePage login = new HomePage(driver);
        login.typeCardNumber("22087009625741");
        login.typePinNumber("5972");
        login.clickSubmitButton();
    }
}



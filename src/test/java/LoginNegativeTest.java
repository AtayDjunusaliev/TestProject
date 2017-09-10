import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by ataydjunusaliev on 9/6/17.
 */
public class LoginNegativeTest {
    WebDriver driver;
    String baseURL;


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseURL = "https://www.co.dakota.mn.us/libraries";
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void invalidLogin(){
        driver.get(baseURL);
        HomePage invalidLogin = new HomePage(driver);
        invalidLogin.typeCardNumber("989488944838");
        invalidLogin.typePinNumber("8844");
        invalidLogin.clickSubmitButton();

    }
}

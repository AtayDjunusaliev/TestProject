import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ataydjunusaliev on 9/5/17.
 */
public class HomePage {
    WebDriver driver;

    //By CardNumberField = By.xpath("//input[@name='j_username']");
    //it works with CSS selector but not with Xpath
    By CardNumberField = By.cssSelector("#j_username");
    //By PinField = By.xpath("//input(@name ='j_password')");
    By PinField = By.cssSelector("#j_password");
    By SubmitButton= By.id("idButton");


    public HomePage(WebDriver driver) {

        this.driver =driver;

    }


    public void typeCardNumber(String CardNumber) {
        driver.findElement(CardNumberField).sendKeys(CardNumber);
    }
    public void typePinNumber(String Pin)    {
        driver.findElement(PinField).sendKeys(Pin);
    }

    public void clickSubmitButton(){
        driver.findElement(SubmitButton).click();
    }
}


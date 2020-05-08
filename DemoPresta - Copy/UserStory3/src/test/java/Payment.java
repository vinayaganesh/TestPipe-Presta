import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment {
    public static WebElement payByBankWire(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@id='payment-option-2']"));
        return element;
    }
    public static WebElement agreeTermsAndConditions(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@value='1']"));
        return element;
    }

    public static WebElement order(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//button[@class='btn btn-primary center-block']"));
        return element;
    }
}

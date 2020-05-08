import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment {

    public static WebElement payByBankWireButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath(" //a[@class='bankwire']"));
        return element;
    }
    public static WebElement confirmationButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//span[contains(text(),'I confirm my order')]"));
        return element;
    }

    public static void checkShippingCost(WebDriver browser){
        String actualShippingCost = browser.findElement(By.xpath("//td[@id='total_shipping']")).getText();
        Assert.assertEquals("$2.00",actualShippingCost);
    }
}

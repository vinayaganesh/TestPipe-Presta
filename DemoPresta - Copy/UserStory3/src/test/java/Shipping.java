import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shipping {
    public static WebElement confirmShipping(WebDriver browser){
    WebElement element = browser.findElement(By.xpath("//button[@name='confirmDeliveryOption']"));
    return element;
}
}

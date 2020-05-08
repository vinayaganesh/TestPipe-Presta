import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOut {
    public static WebElement proceedToCheckout(WebDriver browser){
        //browser.switchTo().frame("framelive");
        WebElement element = browser.findElement(By.xpath("//a[@class='btn btn-primary']"));
        browser.switchTo().frame("framelive");
        return element;
    }
    public static WebElement proceedToCheckout2(WebDriver browser){
        //browser.switchTo().frame("framelive");
        //WebElement element = browser.findElement(By.xpath("//a[@class='btn btn-primary']"));
        WebElement element = browser.findElement(By.xpath("//a[text()='Proceed to checkout']"));
        return element;
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
    public static WebElement registerEmail(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@id='email_create']"));
        return element;
    }
}

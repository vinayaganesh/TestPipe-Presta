import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
    public static WebElement findSignUpButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//a[@class='login']"));
        return element;
    }
}

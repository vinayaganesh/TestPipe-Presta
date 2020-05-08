import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount {
    public static WebElement createAccountButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//form[@id='create-account_form']//span[1]"));
        return element;
    }
}

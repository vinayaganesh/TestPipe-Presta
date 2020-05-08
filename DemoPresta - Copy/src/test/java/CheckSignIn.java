import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckSignIn {
    public static WebElement signOutButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//a[@class='logout']"));
        return element;
    }
    public static WebElement usernameButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@id='email']"));
        return element;
    }
    public static WebElement passwordButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@id='passwd']"));
        return element;
    }
    public static WebElement signInButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//p[@class='submit']//span[1]"));
        return element;
    }

}

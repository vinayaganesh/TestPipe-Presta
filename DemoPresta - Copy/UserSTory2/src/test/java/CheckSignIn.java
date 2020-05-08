import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckSignIn {
    public static WebElement LogInButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//a[@class='login']"));
        browser.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return element;
    }
    public static WebElement usernameButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='email']"));
        return element;
    }
    public static WebElement passwordButton(WebDriver browser){
        WebElement element = browser.findElement(By.id("passwd"));
        return element;
    }
    public static WebElement signInButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//p[@class='submit']//span[1]"));
        return element;
    }

}

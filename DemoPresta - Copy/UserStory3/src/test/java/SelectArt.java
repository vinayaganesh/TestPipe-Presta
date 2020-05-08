import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectArt {
    public static WebElement artSearch(WebDriver browser){
        browser.switchTo().frame("framelive");
        WebElement element = browser.findElement(By.name("s"));
        return element;
    }
    public static WebElement artSelection(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//img[@alt='The adventure begins Framed poster']"));
        return element;
    }
    public static WebElement addToCart(WebDriver browser){
        //class='btn btn-primary add-to-cart
        WebElement element = browser.findElement(By.xpath("//button[@type='submit']"));
        return element;
    }





}

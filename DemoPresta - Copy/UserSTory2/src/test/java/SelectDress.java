import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDress {

    public static WebElement womenButton(WebDriver browser){
        WebElement element = browser.findElement(By.linkText("Women"));
        return element;
    }
    public static WebElement dressesButton(WebDriver browser){
        WebElement element = browser.findElement(By.linkText("Dresses"));
        return element;
    }

    public static WebElement selectDressButton(WebDriver browser){
        WebElement element = browser.findElement(By.linkText("Evening Dresses"));
        return element;
    }

    public static WebElement moreButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//span[contains(text(),'More')]"));
        //WebElement element=browser.findElement(By.xpath("//a[@class='product_img_link']//img[@class='replace-2x img-responsive']"));
        return element;
    }

    public static WebElement selectColorButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//a[@id='color_24']"));
        return element;
    }
}

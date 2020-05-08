import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
    public static WebElement findTShirt(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@id='search_query_top']"));
        return element;
    }
    public static WebElement  SubmitButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//button[@name='submit_search']"));
        return element;
    }
    public static WebElement selectTShirtButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//a[@class='product_img_link']//img[@class='replace-2x img-responsive']"));
        return element;
    }

}

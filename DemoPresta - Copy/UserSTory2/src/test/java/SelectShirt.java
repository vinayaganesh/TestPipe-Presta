import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectShirt {
    public static WebElement shirtButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//a[@class='blockbestsellers']"));
        return element;
    }


    /*public static WebElement addToCartButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
        return element;
    }*/






    public static WebElement continueShoppingButton(WebDriver browser){
        //WebElement element = browser.findElement(By.xpath("//div[@class='shopping_cart']"));
        WebElement element = browser.findElement(By.xpath("//b[contains(text(),'Cart')]"));
        return element;
    }
}

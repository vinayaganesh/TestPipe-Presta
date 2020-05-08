import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Address {
    public static WebElement companyName(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@name='company']"));
        return element;
    }
    public static WebElement address1(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@name='address1']"));
        return element;
    }
    public static WebElement postCode(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@name='postcode']"));
        return element;
    }
    public static WebElement address2(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@name='address2']"));
        return element;
    }
    public static WebElement city(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@name='city']"));
        return element;
    }
    public static WebElement country(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//select[@name='id_country']"));
        return element;
    }
    public static WebElement continueAddressButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//button[@name='confirm-addresses']"));
        return element;
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PersonalInformation {
    public static WebElement socialStatus(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@value='1']"));
        return element;
    }
    public static WebElement firstName(WebDriver browser){
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement element = browser.findElement(By.xpath("//input[@name='firstname']"));

        //[@class='form-control']
        return element;
    }
    public static WebElement lastName(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@name='lastname']"));
        return element;
    }
    public static WebElement email(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@name='email']"));
        return element;
    }
    public static WebElement passWord(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@name='password']"));
        return element;
    }
    public static WebElement birthDate(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@name='birthday']"));
        return element;
    }
    public static WebElement termsAndConditions(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@name='psgdpr']"));
        return element;
    }
    public static WebElement continueButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//button[@name='continue']"));
        return element;
    }
}

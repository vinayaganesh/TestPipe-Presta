import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WriteReview {
    public static WebElement writeReviewButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//a[@class='open-comment-form']"));
        return element;
    }
    public static WebElement writeTitle(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@id='comment_title']"));
        return element;
    }
    public static WebElement writeComment(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//textarea[@id='content']"));
        browser.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        return element;
    }
    public static WebElement sendReviewButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//button[@id='submitNewMessage']//span[contains(text(),'Send')]"));
        browser.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        return element;
    }
    public static WebElement clickOkButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//span[contains(text(),'OK')]"));
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return element;
    }

}

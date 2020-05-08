import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ChechOut {

    public static WebElement addToCartButton(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
        return element;
}
    public static WebElement proceedCheckOutButton(WebDriver browser) {
        WebElement element1 = browser.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
        //text()[contains(.,'Proceed to checkout')]/ancestor::span[1]
        browser.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return element1;
    }

    public static WebElement proceedToCheckOut2Button(WebDriver browser){// throws InterruptedException {
        WebElement element = browser.findElement(
                By.xpath("//text()[.='Proceed to checkout']/ancestor::span[1]"));
        //Thread.sleep(1000);
        return element;
    }

    public static WebElement proceedToCheckOut3Button(WebDriver browser){// throws InterruptedException {
        WebElement element = browser.findElement(By.xpath("//text()[.='Proceed to checkout']/ancestor::span[1]"));
        return element;
    }
    public static WebElement proceedToCheckOut4Button(WebDriver browser) {//throws InterruptedException {
        WebElement element = browser.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"));
        return element;
    }

    public static WebElement termsAndConditionButton(WebDriver browser){// throws InterruptedException {
          WebElement element = browser.findElement(By.xpath("//input[@id='cgv']"));
          return element;
    }

}

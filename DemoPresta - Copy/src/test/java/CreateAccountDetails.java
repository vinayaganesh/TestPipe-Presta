import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountDetails {
    public static WebElement genderButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='id_gender2']"));
        return element;
    }
    public static WebElement firstNameButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='customer_firstname']"));
        return element;
    }
    public static WebElement lastNameButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='customer_lastname']"));
        return element;
    }
    public static WebElement emailButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='email']"));
        return element;
    }
    public static WebElement passwordButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='passwd']"));
        return element;
    }
    public static WebElement dateButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//select[@id='days']"));
        return element;
    }
    public static WebElement monthButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//select[@id='months']"));
        return element;
    }
    public static WebElement yearButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//select[@id='years']"));
        return element;
    }
    public static WebElement companyButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='company']"));
        return element;
    }
    public static WebElement addressButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='address1']"));
        return element;
    }
    public static WebElement cityButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='city']"));
        return element;
    }
    public static WebElement stateButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//select[@id='id_state']"));
        return element;
    }
    public static WebElement pincodeButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='postcode']"));
        return element;
    }
    public static WebElement mobilePhoneButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='phone_mobile']"));
        return element;
    }
    public static WebElement aliasAddressButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='alias']"));
        return element;
    }

     public static WebElement registerButton(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//span[contains(text(),'Register')]"));
        return element;
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//As a customer, I want to search for "Art",
//Select an Art
//Add to Card & Proceed to Payment
//Fill in all Personal Information, Address, Confirm Shipping cost don't exceed $2.00 and finally
//Make Payment

public class Shop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.prestashop.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("User Story 3 ");
        //Search for "Art"
        SelectArt.artSearch(driver).sendKeys("Art");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //Select Art
        SelectArt.artSelection(driver).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

       // Thread.sleep(1000);
        SelectArt.addToCart(driver).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
// Proceed to Checkout
        CheckOut.proceedToCheckout(driver).click();

        CheckOut.proceedToCheckout2(driver).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

       // Thread.sleep(1000);
//Fill In Personal Information
        PersonalInformation.socialStatus(driver).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       // Thread.sleep(3000);
        PersonalInformation.firstName(driver).sendKeys("Vvooov");
        PersonalInformation.lastName(driver).sendKeys("Kamath");
        PersonalInformation.email(driver).sendKeys("vvk@gmail.com");
        PersonalInformation.passWord(driver).sendKeys("sweden");
        PersonalInformation.birthDate(driver).sendKeys("05/03/2009");
        PersonalInformation.termsAndConditions(driver).click();
        PersonalInformation.continueButton(driver).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//Fill Address
        Address.companyName(driver).sendKeys("ITHS");
        Address.address1(driver).sendKeys("Stockholm");
        Address.address2(driver).sendKeys("Stockholm");
        Address.postCode(driver).sendKeys("11344");
        Address.city(driver).sendKeys("Stockholm");
        Address.country(driver).click();
        Address.continueAddressButton(driver).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

       // Thread.sleep(3000);

//Shipping Confirmation
        Shipping.confirmShipping(driver).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Proceed to Payment
        Payment.payByBankWire(driver).click();
        Payment.agreeTermsAndConditions(driver).click();
        Payment.order(driver).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

      //  Thread.sleep(4000);

        driver.quit();
    }
}

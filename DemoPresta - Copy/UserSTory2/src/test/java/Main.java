import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//As a customer I would like to sign in to my Account, Select Evening Dress from Women's Category
//Change to my favourite colour
//ADD to Cart, Proceed to CheckOut
//Make Payment, Whilst check The Shipping Cost that wouldn't exceed $2.00 and finally Confiem
//Periodic driver waits added to see the flow & page loading

public class Main {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //SIgn In to Account
        CheckSignIn.LogInButton(driver).click();
        CheckSignIn.usernameButton(driver).sendKeys("vin.gbhat@gmail.com");
        CheckSignIn.passwordButton(driver).sendKeys("sweden");
        CheckSignIn.signInButton(driver).click();
//Select an Evening Dress from Women's Category
        SelectDress.womenButton(driver).click();
        SelectDress.dressesButton(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        SelectDress.selectDressButton(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        SelectDress.moreButton(driver).click();
      //Change Colour
        SelectDress.selectColorButton(driver).click();
//Proceed with Add To Cart, CheckOut
        ChechOut.addToCartButton(driver).click();
        ChechOut.proceedCheckOutButton(driver).click();
        ChechOut.proceedToCheckOut2Button(driver).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        ChechOut.proceedToCheckOut3Button(driver).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        ChechOut.termsAndConditionButton(driver).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        ChechOut.proceedToCheckOut4Button(driver).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//Time for Payment
        //Check Shipping Cost
        Payment.checkShippingCost(driver);
        Payment.payByBankWireButton(driver).click();
        Payment.confirmationButton(driver).click();
//Driver is made to wait to see that Payment & confirmation flow is seen thouroughly
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.quit();


    }
}

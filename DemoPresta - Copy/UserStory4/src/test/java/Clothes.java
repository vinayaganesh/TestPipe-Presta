import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

// As a customer, I would like to first sign in to my account and search for "Faded" T-shirts and finally write a Review
// Added implicit wait to driver in order to get the test flow clearly.
//User Story 4
public class Clothes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.out.println("User Story 4");
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);

        //Important to Sign In into the account inorder to write a review.
        SignIn.findSignUpButton(driver).click();
        SignIn.usernameButton(driver).sendKeys("vinaya@gmail.com");
        SignIn.passwordButton(driver).sendKeys("sweden");
        SignIn.signInButton(driver).click();

        Search.findTShirt(driver).sendKeys("Faded");
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        Search.SubmitButton(driver).click();

        System.out.println(driver.findElement(By.xpath("//div[@class='right-block']//a[@class='product-name'][contains(text(),'Faded Short Sleeve T-shirts')]")).getText());

        Search.selectTShirtButton(driver).click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

        //Assert that T-shirt searched is actually "Faded" T-shirt-
        String actual = driver.findElement(By.xpath("//h1[contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
        Assert.assertTrue(actual.contains("Faded"));

        //Assert that Right person is logged in into the Account Inorder to write the review.
        actual = driver.findElement(By.xpath("//span[contains(text(),'Vinaya Bhat')]")).getText();
        String expected = "Vinaya Bhat";
        Assert.assertEquals(actual,expected);

        // Writing review
        WriteReview.writeReviewButton(driver).click();
        WriteReview.writeTitle(driver).sendKeys("Blue T-shirt");
        WriteReview.writeComment(driver).sendKeys("Super Bra passform!!!");

        WriteReview.sendReviewButton(driver).click();
        String title = driver.findElement(By.xpath("//input[@id='comment_title']")).getText();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WriteReview.clickOkButton(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.quit();

    }
}

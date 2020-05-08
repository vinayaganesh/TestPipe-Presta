import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PrestaSearch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.prestashop.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame("framelive");
        driver.findElement(By.xpath("//div[@id='contact-link']")).click();
        driver.findElement(By.xpath("//select[@name='id_contact']")).click();

        driver.findElement(By.xpath("//input[@name='from']")).sendKeys("vinaya@gmail.com");
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("I would like to know about the shipping time of the Humming Bird T-shirt ");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


    }
}

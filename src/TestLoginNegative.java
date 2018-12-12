import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestLoginNegative {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        Thread.sleep(5000);
        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();
        System.out.println(login.getText());
        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys("qaz@qaz");
        Thread.sleep(2000);
        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("654123");
        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
        Thread.sleep(2000);
        System.out.println("---- Wrong authorization login or password---- ");
        Thread.sleep(8000);
        driver.quit();
    }
}

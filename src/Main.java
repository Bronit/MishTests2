import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//System.out.println("Hello World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        WebElement button = driver.findElement(
                By.className("mat-stroked-button"));
        System.out.println("Text of button: "+button.getText());
        WebElement button_xpath1 = driver.findElement(By
                .xpath("//button[@class='mat-stroked-button']"));
        System.out.println(button_xpath1.getText());
        WebElement button_css1 = driver.findElement(By
                .cssSelector("button[class='mat-stroked-button']"));
        System.out.println(button_css1.getText());
        WebElement button_par=driver.findElement(By
                .xpath("//div[@class='row justify-content-center']//button"));
        System.out.println(button_par.getText());
        WebElement button_par_css=driver.findElement(By
                .cssSelector("div[class='row justify-content-center'] button"));
        System.out.println(button_par_css.getText());
        WebElement login = driver.findElement(By
                .xpath("//span[contains(text(),'Login')]"));
        login.click();
        Thread.sleep(5000);
        WebElement email_field = driver.findElement(By
                .xpath("//input[@formcontrolname='email']"));
        WebElement password_field = driver.findElement(By
                .xpath("//input[@formcontrolname='password']"));
        email_field.click();
        email_field.sendKeys("marina@123.com");
        password_field.click();
        password_field.sendKeys("marina");
        WebElement login_button=driver.findElement(By
                .xpath("//span[contains(text(),'Log in')]"));
        login_button.click();
        Thread.sleep(5000);

        driver.quit();
    }
}
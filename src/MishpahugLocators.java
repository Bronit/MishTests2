import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MishpahugLocators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
      /* WebElement button_xpath = driver.findElement(
                By.xpath("//div[@class='insideDiv']//button[4]"));
        System.out.println(button_xpath.getText());
        WebElement button_xpath1 = driver.findElement(
                By.xpath("//span[contains(text(),'Calendar')]"));
        System.out.println(button_xpath1.getText());
        WebElement button_xpath2 = driver.findElement(By
                .xpath("//button[@class='btn mat-button']"));
        System.out.println(button_xpath2.getText());
        WebElement button_xpath3 = driver.findElement(By
                .xpath("//button[@class='mat-icon-button']"));
        System.out.println(button_xpath3.getText());

        WebElement button_css = driver.findElement(By
                .cssSelector("button[class='mat-icon-button']"));
        System.out.println(button_css.getText());
        WebElement button_css1=driver.findElement(By
                .cssSelector("mat-divider[class='mat-divider']"));
        System.out.println(button_css1.getText());
        WebElement button_css2=driver.findElement(By
                .cssSelector("div[class='insideDiv']"));
        System.out.println(button_css2.getText());*/

        WebElement create_account = driver.findElement(By
                .xpath("//span[contains(text(),'Create Account')]"));
        create_account.click();
        Thread.sleep(5000);
        WebElement email_field = driver.findElement(By
                .xpath("//input[@formcontrolname='email']"));
        WebElement password_field = driver.findElement(By
                .xpath("//input[@formcontrolname='password']"));
        WebElement repeat_password_field = driver.findElement(By
                .xpath("//input[@placeholder='Repeat password']"));
        email_field.click();
        email_field.sendKeys("poiuy1@poiuy");
        password_field.click();
        password_field.sendKeys("789456");
        repeat_password_field.click();
        repeat_password_field.sendKeys( "789456");
        WebElement registration_button=driver.findElement(By
                .xpath("//span[contains(text(),'Registration')]"));
        registration_button.click();
        Thread.sleep(5000);

        driver.quit();
    }
}




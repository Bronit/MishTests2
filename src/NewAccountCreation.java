import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NewAccountCreation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        Thread.sleep(5000);
        List<WebElement> topLinks = driver.findElements(By
                .xpath("//span[@class='mat-button-wrapper']//span[@class='mat-button-wrapper']"));
        WebElement loginButton = topLinks.get(0);
        WebElement createAccountButton = topLinks.get(1);
        System.out.println("Login: " + loginButton.getText());
        System.out.println("Create Account: " + createAccountButton.getText());
        WebElement logoImg = driver
                .findElement(By.xpath("//img[@class='img-responsive']"));
        System.out.println(logoImg.getAttribute("class"));
        WebElement logoImg_css = driver
                .findElement(By.cssSelector("img.img-responsive"));
        System.out.println(logoImg_css.getAttribute("class"));
        createAccountButton.click();
        WebElement emailField = driver.findElement(By
                .cssSelector("input[formcontrolname='email']"));
        emailField.click();
        emailField.sendKeys("xxxx@gmail.com");
        WebElement passwordField = driver.findElement(By
                .cssSelector("input[formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("123456");
        WebElement passwordFieldRep = driver.findElement(By
                .cssSelector("input[formcontrolname='passwordRep']"));
        passwordFieldRep.click();
        passwordFieldRep.sendKeys("123456");

        WebElement registrationButton = driver
                .findElement(By.xpath("//button[@type='submit']"));
        registrationButton.click();
        Thread.sleep(8000);


        driver.quit();
    }
}




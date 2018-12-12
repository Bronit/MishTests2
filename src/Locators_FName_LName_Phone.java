import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators_FName_LName_Phone {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        WebElement createAccountButton = driver.findElement(By
                .xpath("//span[contains(text(),'Create Account')]"));
        createAccountButton.click();
        WebElement emailField = driver.findElement(By
                .cssSelector("input[formcontrolname='email']"));
        emailField.click();
        emailField.sendKeys("qaz15                                                                                                                                   @qaz");
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
        Thread.sleep(5000);

        WebElement button_FirstName = driver.findElement(
                By.xpath("//input[@id='inputFirstName']"));
        System.out.println(button_FirstName.getText());
        button_FirstName.sendKeys("Elena");
                WebElement button_FirstName_css = driver.findElement(
                By.cssSelector("#inputFirstName"));
        System.out.println(button_FirstName_css.getText());
        WebElement button_FirstName1=driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
        WebElement button_FirstName1_css = driver.findElement(
                By.cssSelector("input[formcontrolname='firstName']"));
        WebElement button_FirstName2=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        WebElement button_FirstName2_css = driver.findElement(
                By.cssSelector("input[placeholder='First Name']"));


        WebElement button_LastName = driver.findElement(
                By.xpath("//input[@id='inputLastName']"));
                System.out.println(button_LastName.getText());
        button_LastName.click();
        button_LastName.sendKeys("Elena");
        WebElement button_LastName_css = driver.findElement(
                By.cssSelector("#inputLastName"));
        System.out.println(button_LastName_css.getText());
        WebElement button_LaststName1=driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
        WebElement button_LastName1_css = driver.findElement(
                By.cssSelector("input[formcontrolname='lastName']"));
        WebElement button_LastName2=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        WebElement button_LastName2_css = driver.findElement(
                By.cssSelector("input[placeholder='Last Name']"));


        WebElement button_PhoneNumber = driver.findElement(
                By.xpath("//input[@id='inputPhoneNumber']"));
        System.out.println(button_PhoneNumber.getText());
        button_PhoneNumber.click();
        button_PhoneNumber.sendKeys("753214554125");
        WebElement button_PhoneNumber_css = driver.findElement(
               By.cssSelector("#inputPhoneNumber"));
        System.out.println(button_PhoneNumber_css.getText());

        WebElement button_PhoneNumber1 = driver.findElement(
                By.xpath("//input[@formcontrolname='phoneNumber']"));
        WebElement button_PhoneNumber1_css = driver.findElement(
                By.cssSelector("input[formcontrolname='phoneNumber']"));
        WebElement button_PhoneNumber2 = driver.findElement(
                By.xpath("//input[@placeholder='Phone Number']"));
        WebElement button_PhoneNumber2_css = driver.findElement(
                By.cssSelector("input[placeholder='Phone Number']"));

        Thread.sleep(5000);
        WebElement button_Cancel = driver.findElement(
                By.xpath("//span[contains(text(),'Cancel')]"));
        System.out.println(button_Cancel.getText());
        button_Cancel.click();
        Thread.sleep(2000);
        driver.quit();

        driver.quit();
    }
}

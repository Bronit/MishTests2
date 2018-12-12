import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NewAccountCreationLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();//запуск драйвер Хром
        driver.get("https://mish.sheygam.com/#/wellcome");//зпуск мишпахи
        Thread.sleep(5000);//урл задержки
        List<WebElement> topLinks = driver.findElements(By
                .xpath("//span[@class='mat-button-wrapper']//span[@class='mat-button-wrapper']"));
        //находим список 2 элементов по линкам
        driver.manage().window().maximize();//увеличить окно
        WebElement loginButton = topLinks.get(0);//логин кнопка по линку 1-го элемента
        WebElement createAccountButton = topLinks.get(1);//2 элемента создать аккаунт-линки одинаковы.
        //разные номера элементов
        System.out.println("Login: " + loginButton.getText());
        System.out.println("Create Account: " + createAccountButton.getText());
        WebElement logoImg = driver
                .findElement(By.xpath("//img[@class='img-responsive']"));//картинка с надписью мишпахаг
        System.out.println(logoImg.getAttribute("class"));
        WebElement logoImg_css = driver
                .findElement(By.cssSelector("img.img-responsive"));
        System.out.println(logoImg_css.getAttribute("class"));

        createAccountButton.click();
        WebElement emailField = driver.findElement(By
                .cssSelector("input[formcontrolname='email']"));
        emailField.click();
        emailField.sendKeys("7891@gmail.com");
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
        WebElement cancelButton = driver.findElement(By
                .xpath("//button[@type='button']/span[contains(text(),'Cancel')]/.."));//сначала
        //перешли вниз в ДОМе на дочерний уровень, потом вверх к родитель-для исп.уникального локатора или чтобы нажимать
        // не на надпись, а на кнопку, в кот. надпись.//*-чтобы?//*[contains(text(),'Cancel')]/..
        cancelButton.click();
        Thread.sleep(3000);
        WebElement menu = driver
                .findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        menu.click();
        Thread.sleep(2000);
        WebElement logoutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logoutMenu.click();
        System.out.println("----------Login created user----------");

        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();
        System.out.println(login.getText());

        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys("7891@gmail.com");
        Thread.sleep(2000);

        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("123456");

        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
        Thread.sleep(8000);
        Thread.sleep(3000);



        driver.quit();
    }
}

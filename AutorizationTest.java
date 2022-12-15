package HomeWork5;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.crypto.Data;
import java.util.concurrent.TimeUnit;

public class AutorizationTest {
    private By inputEmail = By.xpath("//div[@class ='col-sm-9']//input[@id = 'input-email'] ");
    private By inputPassword = By.xpath("//div[@class ='col-sm-9']//input[@id = 'input-password'] ");
    private By btnButtons = By.xpath("//div[@class ='btn btn-main']//input[@type = 'submit'] ");


    @Test
     void autorization extends void DataTest() {


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Data getData = new Data();
        driver.get("https://velesmoda.ru/index.php?route=account/login");

        driver.findElement(inputEmail).sendKeys(getDataTest.email);
        driver.findElement(inputPassword).sendKeys(getDataTest.password);
        driver.findElement(btnButtons).click();


        // driver.quit();

    }
}


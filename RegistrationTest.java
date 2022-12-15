package HomeWork5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends AbstractTest{
    private Object getDataTest;

    @Test
     void registrationTest() {

       DataTest DataTest = new DataTest();
       driver.get(getDataTest.getUrl);
        // driver.findElement(btnRegister).click();
        By inputLastName;
        driver.findElement(inputLastName).sendKeys(getDataTest.lastName);
        driver.findElement(inputFirstName).sendKeys(getDataTest.firstName);
        driver.findElement(inputEmail).sendKeys(getDataTest.email);
        driver.findElement(inputTelephone).sendKeys(getDataTest.telephone);
        driver.findElement(inputPassword).sendKeys(getDataTest.password);
        driver.findElement(inputConfirm).sendKeys(getDataTest.confirm);
        //driver.findElement(By.id(checkbox)).click();
        driver.findElement(btnButtons).click();

        Assertions.assertTrue(getDriver().findElement(By.id("input-email")).getText().equals("Your account"));
    }


        // driver.quit();
    }





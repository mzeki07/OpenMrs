package Task;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task07 {
    @Test

    public void adminButtonIsDisplayedTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.openmrs.org/openmrs/login.htm");

        WebElement username = driver.findElement(By.cssSelector("input[placeholder$=\"username\"]"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input[placeholder$=\"password\"]"));
        password.sendKeys("Admin123");
        WebElement location = driver.findElement(By.id("Inpatient Ward"));
        location.click();
        WebElement logInButton = driver.findElement(By.id("loginButton"));
        logInButton.click();

        WebElement adminButton = driver.findElement(By.cssSelector("li[style=\"cursor: pointer;\"]"));
        MyMethods.myWait(3);
        System.out.println(adminButton.isDisplayed());
        Assert.assertTrue(adminButton.isDisplayed());
    }
    public class MyMethods {
        public static void myWait(int seconds) {
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

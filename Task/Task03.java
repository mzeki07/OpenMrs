package Task;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Task03 {

    @Test
    public void locationNameBackgroundColorChangesTest(){

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

        WebElement locationsMenu = driver.findElement(By.id("selected-location"));
        locationsMenu.click();

        Actions actions = new Actions(driver);
        List<WebElement> locations = driver.findElements(By.xpath("//ul[@class='select']/li"));
        for (WebElement eachLocation : locations) {

            Action action = actions.moveToElement(eachLocation).build();
            action.perform();
String color = eachLocation.getCssValue("background-color");
            Assert.assertEquals(color,"rgba(0, 127, 255, 1)");

        }




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

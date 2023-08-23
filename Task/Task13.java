package Task;

import Method.BaseDriver;
import Method.MyMethod;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Task13 extends BaseDriver {
    @Test
    public void task13() {


        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement location = driver.findElement(By.id("Pharmacy"));
        WebElement login = driver.findElement(By.id("loginButton"));
        username.sendKeys("Admin");
        password.sendKeys("Admin123");
        username.click();
        password.click();
        location.click();
        login.click();



        WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]"));
        myAccount.click();

        WebElement myAccountEnter = driver.findElement(By.xpath("//*[@id=\"user-account-menu\"]/li/a"));
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(myAccountEnter).click().build();
        action.perform();


        WebElement MyLanguages = driver.findElement(By.xpath("//*[@id=\"tasks\"]/a[2]/div"));
        MyLanguages.click();

        WebElement MyLanguagesButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/div[1]"));
        MyLanguagesButton.click();

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }
        WebElement ClickSave = driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/div[2]/input[1]"));
        ClickSave.click();

        WebElement nearestBranchMessage = driver.findElement(By.cssSelector("div[class=\"text\"]>:last-child"));
        nearestBranchMessage.isDisplayed();

        String expectedMessage = "User defaults could not be updated.";
        String actualMessage = nearestBranchMessage.getText();
        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Verification successful!");
        } else {
            System.out.println("Verification failed!");
        }

        MyMethod.myWait(5);
        waitAndQuit();


        }
    }





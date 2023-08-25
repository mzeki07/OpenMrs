package Task;

import Method.BaseDriver;
import Method.MyMethod;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Task11 extends BaseDriver {
    @Test
    public void test12(){
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

       WebElement english = driver.findElement(By.cssSelector("input[value=\"en\"]"));
       english.click();
       Assert.assertTrue(english.isSelected());
        MyMethod.myWait(1);

       WebElement englishUK = driver.findElement(By.cssSelector("input[value=\"en_GB\"]"));
       englishUK.click();
       Assert.assertTrue(englishUK.isSelected());
        MyMethod.myWait(1);


        WebElement spanish = driver.findElement(By.cssSelector("input[value=\"es\"]"));
        spanish.click();
        Assert.assertTrue(spanish.isSelected());
        MyMethod.myWait(1);


        WebElement french = driver.findElement(By.cssSelector("input[value=\"fr\"]"));
        french.click();
        Assert.assertTrue(french.isSelected());
        MyMethod.myWait(1);


        WebElement italian = driver.findElement(By.cssSelector("input[value=\"it\"]"));
        italian.click();
        Assert.assertTrue(italian.isSelected());
        MyMethod.myWait(1);


        WebElement portuguese = driver.findElement(By.cssSelector("input[value=\"pt\"]"));
        portuguese.click();
        Assert.assertTrue(portuguese.isSelected());

        waitAndQuit();
    }
}


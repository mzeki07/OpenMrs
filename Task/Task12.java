package Task;

import Method.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Task12 extends BaseDriver {
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

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
            if (checkboxes.get(i).isSelected()) {
                System.out.println("CheckBox is selected" );
            }
        }
    }
}

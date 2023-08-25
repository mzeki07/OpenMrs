package Task;


import Method.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.lang.reflect.Method;

public class Task10  extends BaseDriver {

    public static void main(String[] args) {


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
        WebElement AdminButton = driver.findElement(By.xpath("//li[contains(@class, 'identifier')]"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(AdminButton).build();
        action.perform();


        WebElement myAccount = driver.findElement(By.id("user-account-menu"));
        myAccount.click();

        WebElement Mylanguage = driver.findElement(By.xpath("//a[contains(@class, 'button app big') and contains(., 'My Languages')]"));
        Mylanguage.click();

        String expectedTitlePart = "My Languages";
        WebElement searchResultsMessage = driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[3]"));
        String actualTitle ="My Languages" ;
        if (actualTitle.equals(expectedTitlePart)) {
            System.out.println(" Expected Title found.");
        } else {
            System.out.println("Expected Title not found.");

        }
        driver.quit();
    }

}





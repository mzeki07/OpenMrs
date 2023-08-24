import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Task08 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
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

        MethodLogin_Wait.myWait(2);

        WebElement myAccount = driver.findElement(By.id("user-account-menu"));
        myAccount.click();



        MethodLogin_Wait.myWait(3);

        driver.quit();
//









        driver.quit();
    }

    }

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        WebElement Admin = driver.findElement(By.xpath("//i[contains(@class, 'icon-caret-down appui')]"));
        Admin.click();
        MethodLogin_Wait.myWait(4);





        driver.quit();
    }

    }

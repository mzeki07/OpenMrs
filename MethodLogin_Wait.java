import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodLogin_Wait {
    public static void loginMethod(){
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


    }

    public static void myWait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

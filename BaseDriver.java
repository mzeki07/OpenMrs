import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
//    public BaseDriver(){
//        System.out.println("constructor works");
//    }

    static {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();

        driver.manage().window().maximize();// Expands the driver until the edges of the screen.

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        //it waits until our computer downloads all necessary files from the server
        //if it can not download them in specified time,selenium throws an exception.
        //that means there is a problem with the server side

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //waits until the browser translates all the documents downloaded and converts them to html codes
        //if it can not convert them into html in specified time period, Selenium throws an exception
        //that means your application is not competible with the browser
//        System.out.println("static works");
    }
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

}

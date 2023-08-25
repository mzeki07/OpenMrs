package Task.Cavour_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {



    /*
Verify if you are able to login by entering the valid username and valid password without choosing a location.
verify that the error message is "You must choose a location!"

    */
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.findElement(By.id("username")).sendKeys("Admin");
        driver.findElement(By.id("password")).sendKeys("Admin123");
        driver.findElement(By.id("loginButton")).click();
        WebElement error = driver.findElement(By.id("sessionLocationError"));
        if(error.isDisplayed()){
            System.out.println("True");

        }
        else {
            System.out.println("false");
            System.out.println("yes ");
        }







    }
}



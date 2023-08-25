package Task.Cavour_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_9 {

    public static void main(String[] args) {

        /*
        After click on "My Account" button, verify if the title of the page is "My Account".

         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.findElement(By.id("username")).sendKeys("Admin");
        driver.findElement(By.id("password")).sendKeys("Admin123");
        driver.findElement(By.id("Pharmacy")).click();
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.cssSelector("li.nav-item")).click();
        driver.findElement(By.linkText("My Account")).click();




//
//        WebElement error = driver.findElement(By.id("sessionLocationError"));
//        if(error.isDisplayed()){
//            System.out.println("True");
//
//        }
//        else {
//            System.out.println("false");


    }
}



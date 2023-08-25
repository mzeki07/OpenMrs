package Cavour_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_5 {


    public static void main(String[] args) {

        /*
     Verify if you are on the home page.

         */
        String web ;
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        if (loginButton.isDisplayed()) {
            System.out.println("Page opened successfully.");
        } else {
            System.out.println("Page opening failed.");
        }



    }
}


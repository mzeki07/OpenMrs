package Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
public class Task06{


    @Test
    public void Test(){


        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.openmrs.org/openmrs/login.htm");
        List<String> locationsLogin = new ArrayList<>();
        List<WebElement> locationsInLoginPage = driver.findElements(By.cssSelector("li[tabindex=\"0\"]"));
        System.out.println(locationsInLoginPage.size());
        for(WebElement location : locationsInLoginPage){
            locationsLogin.add(location.getText());
        }
        System.out.println(locationsLogin);

        WebElement username = driver.findElement(By.cssSelector("input[placeholder$=\"username\"]"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input[placeholder$=\"password\"]"));
        password.sendKeys("Admin123");
        WebElement location = driver.findElement(By.id("Inpatient Ward"));
        location.click();
        WebElement logInButton = driver.findElement(By.id("loginButton"));
        logInButton.click();

        WebElement menuButton = driver.findElement(By.className("navbar-toggler-icon"));
        menuButton.click();
        MyMethods.myWait(1);
        WebElement locationMenuButton = driver.findElement(By.cssSelector("a[href=\"javascript:void(0);\"]"));
        locationMenuButton.click();

//        List<WebElement> locationsInHomePage = driver.findElements(By.xpath("//li[text()='Isolation Ward']/../li"));
        List<WebElement> locationsInHomePage = driver.findElements(By.xpath("//ul[@class='select']/li"));
        List<String> locationsHomePage = new ArrayList<>();
        for (WebElement location1:locationsInHomePage){
            locationsHomePage.add(location1.getText());
        }
        System.out.println(locationsHomePage);

        boolean listsAreEqual = locationsLogin.equals(locationsHomePage);
        System.out.println(listsAreEqual);

//        Assert.assertArrayEquals;






    }
    public class MyMethods {
        public static void myWait(int seconds) {
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

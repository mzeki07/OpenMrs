import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
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
        WebElement MyAccount =driver.findElement(By.xpath("//a[contains(., 'My Account')]"));
        MyAccount.click();

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


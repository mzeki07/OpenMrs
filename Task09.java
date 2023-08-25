import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Task09 {
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
        String expectedTitlePart = "My Account";
        WebElement searchResultsMessage = driver.findElement(By.xpath("//i[contains(@class, 'icon-chevron-right link')]"));
        String actualTitle ="My Account" ;
        if (actualTitle.equals(expectedTitlePart)) {
            System.out.println(" Expected Title found.");
        } else {
            System.out.println("Expected Title not found.");
        }

        MethodLogin_Wait.myWait(4);
        //just
    }

}
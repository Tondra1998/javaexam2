package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class action1 {
    public static void main(String[] args) {

        //click on mens shirt and use implicit wait

        System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

       WebElement menButton = driver.findElement(By.xpath("//div[@data-automation-id='menu-item-link-4']"));

       Actions a = new  Actions(driver);
       a.moveToElement(menButton).build().perform();

       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

       driver.findElement(By.linkText("Shirts")).click();

    }
}

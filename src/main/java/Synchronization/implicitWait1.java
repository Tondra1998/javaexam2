package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class implicitWait1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        WebElement holiday = driver.findElement(By.xpath("//div[@data-automation-id='menu-item-link-0']"));
        Actions day = new Actions(driver);
        day.moveToElement(holiday).perform();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement gifts = driver.findElement(By.linkText("Cozy Gifts"));
        gifts.click();
    }
}

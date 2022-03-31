package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {

        //implicit wait - waits for everything. once things got ready, doesn't wait longer

        System.setProperty("webdriver.chrome.driver", "/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        WebElement babyandkids = driver.findElement(By.cssSelector("[data-automation-id='menu-item-link-6']"));
        Actions kids = new Actions(driver);
        kids.moveToElement(babyandkids).perform();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement babyshoes = driver.findElement(By.linkText("Baby Shoes"));
        babyshoes.click();



    }
}

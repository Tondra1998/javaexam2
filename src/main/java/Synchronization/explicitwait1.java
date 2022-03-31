package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        WebElement toys = driver.findElement(By.xpath("//div[@data-automation-id='menu-item-link-1']"));
        Actions games = new Actions(driver);
        games.moveToElement(toys).perform();

        WebDriverWait waits = new WebDriverWait(driver, 5);
        waits.until(ExpectedConditions.elementToBeClickable(By.linkText("Toys & Games")));

        WebElement toyandgame = driver.findElement(By.linkText("Toys & Games"));
        toyandgame.click();
    }
}

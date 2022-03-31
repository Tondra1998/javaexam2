package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {
    public static void main(String[] args) {

        //explicit wait - waits for a certain condition on specific webelement

        System.setProperty("webdriver.chrome.driver", "/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        WebElement jewellery = driver.findElement(By.cssSelector("[data-automation-id='menu-item-link-8']"));
        Actions jewel = new Actions(driver);
        jewel.moveToElement(jewellery).perform();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Fine Rings")));

        WebElement jewels = driver.findElement(By.linkText("Fine Rings"));
        jewels.click();

    }
}

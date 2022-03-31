package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sleep1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        WebElement women = driver.findElement(By.xpath("//div[@data-automation-id='menu-item-link-3']"));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();

        Thread.sleep(5000);

        WebElement shoes = driver.findElement(By.linkText("Shoes"));
        shoes.click();
    }
}

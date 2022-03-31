package JcpenneyHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jcpen6 {
    public static void main(String[] args) {

        //how to close/quit a browser

        System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        driver.findElement(By.cssSelector("[type='search']")).sendKeys("watch");
        driver.quit();


    }
}

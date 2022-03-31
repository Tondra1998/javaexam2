package JcpenneyHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jcpen2 {
    //write something on the search box then click on it

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        driver.findElement(By.cssSelector("[type='search']")).sendKeys("lipstick");
        driver.findElement(By.cssSelector("[title='search']")).click();



    }
}


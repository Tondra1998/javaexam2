package JcpenneyHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jcpen8 {
    public static void main(String[] args) {
        //click on a product and add to cart


        System.setProperty("webdriver.chrome.driver", "/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        driver.findElement(By.cssSelector("[type='search']")).sendKeys("lipstick");
        driver.findElement(By.cssSelector("[title='search']")).click();
        driver.findElement(By.cssSelector("[title='FENTY BEAUTY BY RIHANNA Mattemoiselle Plush Matte Lipstick']")).click();
        driver.findElement(By.cssSelector("[id='GlobalOptions-AddToCart']")).click();
    }
}

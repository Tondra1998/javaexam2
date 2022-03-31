package JcpenneyHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jcpen3 {
    //click the cart button and see if it is working

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        driver.findElement(By.cssSelector("[class='_2IWk1']")).click();

    }
}



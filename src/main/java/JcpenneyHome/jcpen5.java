package JcpenneyHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jcpen5 {
    public static void main(String[] args) {
        //check and see if the jcpenney logo is available

        System.setProperty("webdriver.chrome.driver", "/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        System.out.println(driver.findElement(By.id("jcp-logo")).isDisplayed());



    }
}

package JcpenneyHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jcpen7 {
    public static void main(String[] args) {

        //click the cart button and get the text


        System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        driver.findElement(By.cssSelector("[title='my cart']")).click();
        System.out.println(driver.findElement(By.cssSelector("[data-automation-id='at-start-shopping-button']")).getText());



    }
}
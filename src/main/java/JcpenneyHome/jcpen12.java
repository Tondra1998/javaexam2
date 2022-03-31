package JcpenneyHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class jcpen12{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        List<WebElement> links = driver.findElements(By.xpath("//*[@class='_2C7xX _1ONJ2']"));

        for(WebElement a: links){
            a.click();
            Thread.sleep(2000);
            driver.navigate().to("https://www.jcpenney.com");
            Thread.sleep(2000);
        }

    }

}

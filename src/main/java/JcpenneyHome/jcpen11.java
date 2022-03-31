package JcpenneyHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class jcpen11 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        List<WebElement> b = driver.findElements(By.xpath("//li[@class='_2C7xX _1ONJ2']"));

        for(WebElement c : b){
            System.out.println(c.getText());
        }


    }
}

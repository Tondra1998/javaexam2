package JcpenneyHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class jcpen9 {
    public static void main(String[] args) throws InterruptedException {

        //find multiple elements using common link from footer

        System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        List<WebElement> footer = driver.findElements(By.xpath("//li[@class='_32X-P _1DND5 _3JqwR']"));

        for (WebElement i: footer){
            String a= i.getText();
            System.out.println(a);
        }




    }
}

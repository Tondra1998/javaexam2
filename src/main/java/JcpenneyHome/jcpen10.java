package JcpenneyHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jcpen10{
    public static void main(String[] args) {

        //click one webelement  from header using xpath and get text

        System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");

        //driver.findElement(By.xpath("//div[@data-automation-id='menu-item-link-2']")).click();
        //System.out.println(driver.findElement(By.xpath("//div[@data-automation-id='menu-item-link-2']")).getText());

        WebElement a = driver.findElement(By.xpath("//div[@data-automation-id='menu-item-link-2']"));
        System.out.println(a.getText());
        a.click();

    }

}

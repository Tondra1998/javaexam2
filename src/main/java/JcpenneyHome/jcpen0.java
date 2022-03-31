package JcpenneyHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jcpen0 {
    public static void main(String[] args) {

        //get the title of jcpenney welcome page

            System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.jcpenney.com");


            System.out.println(driver.getTitle());

        }
    }


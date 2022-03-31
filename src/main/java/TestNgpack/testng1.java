package TestNgpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testng1 {
    public static void main(String[] args) {
        testng1 a = new testng1();
        a.printTitle();
    }


    void printTitle(){
        System.setProperty("webdriver.chrome.driver", "/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jcpenney.com");
        System.out.println(driver.getTitle());
    }


        }



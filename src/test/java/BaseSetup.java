import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetup {
    WebDriver driver;

    void setup(String url){
        System.setProperty("webdriver.chrome.driver","/Users/tondrakhan/IdeaProjects/Macys/src/Drivers/chromedriver 6");
        driver = new ChromeDriver();
        driver.get(url);
    }

    void quit() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

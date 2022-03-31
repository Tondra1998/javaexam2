import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.Path;

import static java.nio.file.Files.move;

public class TestJcpenHomePage extends BaseSetup{
    JcpenHomePage home;
    @BeforeMethod
    void setUpJcpenney(){
        setup("https://www.jcpenney.com");
        home = PageFactory.initElements(driver, JcpenHomePage.class);

    }

    @AfterMethod
    void CloseBrowser() throws InterruptedException {
        quit();


    }
    @Test
    void TestlogoText(){
      boolean actualText = home.Testlogo();
        Assert.assertTrue(actualText);

    }
    @Test
    void TestText(){
        String testing = home.testOne();
        Assert.assertEquals(testing, "Holiday");
    }
    @Test
    void cartButtonisDisplayed(){
        boolean tests = home.testTwo();
        Assert.assertTrue(tests);
    }
    @Test
    void testSearch(){
        boolean Search = home.testThree();
        Assert.assertTrue(Search);
    }
    @Test
    void testfour(){
        boolean visible = home.testFour();
        Assert.assertTrue(visible);
    }

    @Test
    void ClickLogoTakesHome(){
        home.clickLogo();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.jcpenney.com/");
    }

    }






import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestJcpenHomePageTwo extends BaseSetup {
    JcpenHomePageTwo homes;
    @BeforeMethod
    void SetUpJcpenney(){
        setup("https://www.jcpenney.com");
        homes = PageFactory.initElements(driver, JcpenHomePageTwo.class);
    }
    @Test
    void Testtext() throws IOException {
        String testing = homes.Testone();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("screenssots/" +"capture" + ".jpg"));
        Assert.assertEquals(testing, "women");
    }


}

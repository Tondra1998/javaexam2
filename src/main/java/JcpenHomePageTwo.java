import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JcpenHomePageTwo {
    @FindBy (xpath = "//div[@data-automation-id='menu-item-link-3']")
    WebElement testWomenbutton;
    //
    //
    //

    String Testone(){
        String message = testWomenbutton.getText();
        return message;
    }
}

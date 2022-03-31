import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JCpenneyCartPage {

    @FindBy (xpath = "//div[@data-automation-id='cart-is-empty']")
    WebElement emptyCartText;
    @FindBy (xpath = "//button[@id='start-shopping-btn']")
    WebElement todaysDeal;
    @FindBy (css = "[data-automation-id='at-signin-link']")
    WebElement signIn;
    @FindBy (css = "[id='loginEmail']")
    WebElement signinEmailBox;

    String getTextfromCart(){
        return emptyCartText.getText();
    }
    String cartone(){
        return todaysDeal.getText();
    }
    String cartTwo(){
        return signIn.getText();
    }
}

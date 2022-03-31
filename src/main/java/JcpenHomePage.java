import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JcpenHomePage  {

    @FindBy  (xpath = "//a[@data-automation-id='jcp-logo']")
    WebElement logo;
    @FindBy (xpath = "//div[@data-automation-id='menu-item-link-0']")
            WebElement text;
    @FindBy (xpath = "//div[@class='_2IWk1']")
            WebElement cart;
    @FindBy (css = "[type='search']")
            WebElement searchButton;
    @FindBy (css = "[aria-label='Careers']")
            WebElement footer;
    @FindBy (css = "[aria-label='Careers']")
            WebElement getword;
    //
    //

    boolean Testlogo(){
        boolean test = logo.isDisplayed();
        return test;
    }

    String testOne(){
        String message = text.getText();
        return message;
    }

        boolean testTwo(){
        boolean testcart = cart.isDisplayed();
        return testcart;
    }

    boolean testThree(){
        boolean visiblity = searchButton.isDisplayed();
        return visiblity;
    }

    boolean testFour() {
        boolean canSee = getword.isDisplayed();
        return canSee;
    }

    void clickLogo(){
        logo.click();
    }

}

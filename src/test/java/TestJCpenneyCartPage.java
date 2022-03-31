import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJCpenneyCartPage extends BaseSetup{

    JCpenneyCartPage cart;

    @BeforeMethod
    void setupcart(){
        setup("https://www.jcpenney.com/cart");
        cart = PageFactory.initElements(driver, JCpenneyCartPage.class);
    }

    @Test
    void testEmptyCartText(){
        String actualText = cart.getTextfromCart();
        Assert.assertEquals(actualText, "Start with an Empty Cart, Finish in Style");
    }
    @Test
    void visible(){
       String todaysDealButton = cart.cartone();
        Assert.assertEquals(todaysDealButton, "Shop Today's Deals");
    }
    @Test
    void visiblity(){
       String signInButton = cart.cartTwo();
        Assert.assertEquals(signInButton, "Sign in");
    }
}

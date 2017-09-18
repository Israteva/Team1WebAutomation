package Homepage;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class TestCreditCards extends CommonAPI {
    @Test
    public void clickcreditcardTag() {
        clickbuttonbyCSS("#creditCards>a");
        waitTime();
    }
    @Test
    public void searchByCSS() {
        searchByCSS("#cA-cardsUseridMasked","UserID");
    }
    @Test
    public void searchByXpath(){
        searchByXPath(".//*[@id='PASSWORD']","password");
    }
    @Test
    public void clickButtonByCSS(){
        clickbuttonbyCSS(".cA-cardsLoginSubmit.cA-DD-singon-buttom");
    }
    @Test
    public void clickButtonByXpath(){
        clickbuttonbyCSS(".cA-DD-browseCards");
    }
}

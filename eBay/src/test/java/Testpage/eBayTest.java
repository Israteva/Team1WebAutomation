package Testpage;

import Homepage.*;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class eBayTest extends CommonAPI {
    @Test (priority = 1)
    public void Ebayelectronics(){
        Electronics ebay = PageFactory.initElements(driver,Electronics.class);
        ebay.EbayElectronics();
        navigateback();
    }
    @Test(priority = 2)
    public void testToys(){
        Toys ebay = PageFactory.initElements(driver,Toys.class);
        ebay.ebayToys();
        navigateback();
    }
    @Test(priority = 3)
    public void testDeals(){
        EbayDailyDeals ebay = PageFactory.initElements(driver ,EbayDailyDeals.class);
        ebay.DailyDeals();
        navigateback();
    }

    @Test(priority = 4)
    public void testHomeandGarden(){
        HomeGarden ebay = PageFactory.initElements(driver,HomeGarden.class);
        ebay.HomeGarden();
        navigateback();
    }
    @Test(priority = 5)
    public void testMusic(){
        Music ebay = PageFactory.initElements(driver,Music.class);
        ebay.Music();
        navigateback();
    }
    @Test(priority = 8)
    public void testRecentView(){
        eBayRecentlyView eb = PageFactory.initElements(driver, eBayRecentlyView.class);
        eb.clickOnRecentlyView();
        navigateback();
    }
    @Test(priority = 9)
    public void testsignIn(){
        SignIn ebay =PageFactory.initElements(driver,SignIn.class);
        ebay.Signin("IsratEva@gmail.com","abc123");
        navigateback();
    }
    @Test(priority = 10)
    public void testSearch() {
        eBayHomepage hp = PageFactory.initElements(driver, eBayHomepage.class);
        hp.searchFor("guitar");
    }
    @Test(priority = 11)
    public void testClick(){
        MyeBay ebay = PageFactory.initElements(driver,MyeBay.class);
        ebay.clickOnMyeBay();
    }
    @Test(priority = 12)
    public void Brokenlink(){
        brokenLinks();
    }


}

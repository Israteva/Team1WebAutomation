package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Electronics extends CommonAPI {
    @FindBy(how = How.XPATH,using = ".//*[@id='s0-container']/li[6]/a")
    public static WebElement Electronics;
    public void EbayElectronics(){
        Electronics.click();
    }
}

package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeGarden extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='s0-container']/li[8]/a")
    public static WebElement homegarden;

    public void HomeGarden() {
        homegarden.click();
    }
}

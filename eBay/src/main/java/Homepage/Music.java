package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Music extends CommonAPI {
    @FindBy(how = How.XPATH,using = ".//*[@id='s0-container']/li[12]/a")
    public static WebElement music;
    public void Music(){
        music.click();
    }
}

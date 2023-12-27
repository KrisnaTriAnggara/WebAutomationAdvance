package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PricePage extends BasePage {

    public PricePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='clusterContent']//div[@class='textRight flexOne']/div[.='₹ 5,309per adult']")
    WebElement txtBerhasilExtract;


    public String getHomeText() {
        return getText(txtBerhasilExtract);
    }

}

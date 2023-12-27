package automation.simple;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseWebTest;

import java.time.Duration;

public class SeleniumTest extends BaseWebTest {

    @Test
    public void extractValue(){
        //open browser
        driver.get().findElement(By.xpath("//a[.='Search']")).click();
        String mainWindowID = driver.get().getWindowHandle();
        String txtActualBerhasilExtract = driver.get().findElement(By.xpath("//div[@class='clusterContent']//div[@class='textRight flexOne']/div[.='₹ 5,309per adult']")).getText();
        String txtExpectedBerhasilExtract ="₹ 5,309";
        Assert.assertEquals(txtActualBerhasilExtract,txtExpectedBerhasilExtract);


//        String txtActualBerhasilExtract = driver.get().findElement(By.xpath("//div[@class='textRight flexOne']/div[.='₹ 7,031per adult']")).getText();
//        String txtExpectedBerhasilExtract = "";

//        String txtActualBerhasilLogin = driver.get().findElement(By.xpath("//h2[contains(.,'Secure Area')]")).getText();
//        String txtExpectedBerhasilLogin = "Secure Area";
//        System.out.println(txtActualBerhasilLogin);



    }
}




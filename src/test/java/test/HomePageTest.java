package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.HomePage;

public class HomePageTest extends BaseWebTest{


    @Test
     public void succesGetValue(){
        HomePage homePage = new HomePage(driver, explicitWait);

        homePage.homePage();

    }



}

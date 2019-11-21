package testautomation.cases;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testautomation.maincore.Base;
import testautomation.testpages.LoginPage;
import java.io.IOException;

public class TestLoginPage extends Base {
    
    private LoginPage objLoginPage ;
    @BeforeTest
    public void setup ()throws IOException{
        driver = initializeDriver();
        driver.get(getPropertyValue("Config","AUTURL"));
    }
    @Test
    public void loginToApplication () throws IOException {
        objLoginPage = new LoginPage(driver);
        //String strLoginPageTitle = objLoginPage.getTitle();
        //Assert.assertEquals(strLoginPageTitle,getPropertyValue("ORProperty","Title"));
        objLoginPage.loginToApplication("admin@housebuyersofamerica.com","d3P#7#!K8B-k6+nE");
        
    }
    @AfterTest
    public void endSetup () {
        //driver.quit();
    } 
}
package testautomation.cases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testautomation.maincore.Base;
import testautomation.testpages.LoginPage;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLoginPage extends Base {
    public static Logger log = LogManager.getLogger(Base.class.getName());
    private LoginPage objLoginPage ;
    @BeforeTest
    public void setup ()throws IOException{
        log.info("Initializing the driver");
        driver = initializeDriver();
        driver.get(getPropertyValue("ConfigProperty","AUTURL"));
    }
    @Test
    public void loginToApplication () throws IOException {
        log.info("In Login application test");
        objLoginPage = new LoginPage(driver);
        String strLoginPageTitle = objLoginPage.getTitle();
        Assert.assertEquals(strLoginPageTitle,getPropertyValue("ORProperty","Title"));
        objLoginPage.loginToiBridgeApplication("infxs01","manager#17");
    }
    @AfterTest
    public void endSetup () {
        driver.close();
    } 
}
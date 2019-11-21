package testautomation.maincore;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.util.Date;

public class Base {
    
    public WebDriver driver;

   public String getPropertyValue (String strPropertyFileName, String strPropertyKeyName)throws IOException {
    String strPropertyValue;
    String strPathProprtyPath = "\\src\\main\\java\\testautomation\\configAndData\\"+strPropertyFileName+".properties";
    FileInputStream objFIS = new FileInputStream(System.getProperty("user.dir")+strPathProprtyPath);
    Properties objProperties = new Properties();
    objProperties.load(objFIS);
    strPropertyValue = objProperties.getProperty(strPropertyKeyName);
    return strPropertyValue;
    }

    public WebDriver initializeDriver() throws IOException{
        String browserName = this.getPropertyValue("Config","BrowserName");
        //String switchChar = browserName;
        switch (browserName.toLowerCase()){
            case"chrome":
                if(driver == null){
                    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+this.getPropertyValue("Config","ChromeDriver"));
                    driver = new ChromeDriver();
                }
                break;
            case "firefox":
                System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+this.getPropertyValue("Config","GeckoDriver"));
                driver = new FirefoxDriver();
                break;
            case "Internet explorer":
                System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+this.getPropertyValue("Config","IEDriver"));
                driver = new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public void takeScreenShort (String strResult) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String strFileSuffix = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"//Screens//"+strResult+"_"+strFileSuffix+".png"));
    }
}
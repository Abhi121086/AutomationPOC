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
    private Properties objProperties = new Properties();
    private FileInputStream objFIS;
    private String strPathProprtyPath = "\\src\\main\\java\\testautomation\\maincore\\Paths.properties";

   public Properties loadProperty (String strPropertyPath)throws IOException {
    objFIS = new FileInputStream(System.getProperty("user.dir")+strPropertyPath);
       objProperties.load(objFIS);
       return objProperties ;
   }

   public String getPropertyValue (String strPropertyFileName, String strPropertyKeyName)throws IOException {
    String strPropertyValue;
    objProperties = loadProperty(strPathProprtyPath);
    strPropertyValue = objProperties.getProperty(strPropertyFileName);
    objProperties = loadProperty(strPropertyValue);
    strPropertyValue = objProperties.getProperty(strPropertyKeyName);
   return strPropertyValue;
    }
    public WebDriver initializeDriver() throws IOException{
        String browserName = this.getPropertyValue("ConfigProperty","BrowserName");
        char switchChar = browserName.toUpperCase().charAt(0);
        switch (switchChar){
            case'C':
                if(driver == null){
                    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+this.getPropertyValue("ConfigProperty","ChromeDriver"));
                    driver = new ChromeDriver();
                }
                break;
            case 'F':
                System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+this.getPropertyValue("ConfigProperty","GeckoDriver"));
                driver = new FirefoxDriver();
                break;
            case 'I':
                System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+this.getPropertyValue("ConfigProperty","IEDriver"));
                driver = new InternetExplorerDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
public void takeScreenShort (String strResult) throws IOException {
    File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String strFileSuffix = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
    FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"//Screens//"+strResult+"_"+strFileSuffix+".png"));
}
}
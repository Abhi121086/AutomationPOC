package testautomation.cases;

import org.testng.annotations.Test;
import testautomation.maincore.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Json_check {
	//WebDriver driver = new FirefoxDriver();	
  @Test
  public void Test_Json() throws NoSuchMethodException, SecurityException {
	  //System.setProperty("webdriver.gecko.driver","F:\\iBridge\\Abhishek\\Automation\\Selenium Automation\\Framework Samples\\JavaJsonParser\\geckodriver.exe");
	  //driver.get("https://live.ibridgeworkflow.com/iBridge/Page/Page.html");
	  JsonObjectMapper JOM = new JsonObjectMapper();
	  JOM.Mapper(System.getProperty("user.dir")+"\\src\\main\\java\\testautomation\\configAndData\\Sample.json", "getAppointment", "getFacility");
	  
  }
}
package testautomation.testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testautomation.maincore.Base;
import java.io.IOException;

public class LoginPage {

   private WebDriver driver;

    By webUserName;
    By webPassword;
    By webLoginButton;
    //@FindBy(how = How.XPATH,using = "/html/body/div[2]/div[2]/div[2]/div/div/form/div/div/input[1]")
    //WebElement webUserName;
    //@FindBy(how = How.XPATH,using = "/html/body/div[2]/div[2]/div[2]/div/div/form/div/div/input[2]")
    //WebElement webPassword;
    //@FindBy(how = How.XPATH,using = "/html/body/div[2]/div[2]/div[2]/div/div/form/div/div/button")
    //WebElement webLoginButton;

    public LoginPage(WebDriver driver) throws IOException {
        this.driver = driver;
        //PageFactory.initElements(driver,this);
        Base objBase = new Base();
        webUserName = By.xpath(objBase.getPropertyValue("ORProperty","UserName"));
        webPassword = By.xpath(objBase.getPropertyValue("ORProperty","Password"));
        webLoginButton = By.xpath(objBase.getPropertyValue("ORProperty","LoginButton"));
    }

    private void setUserName (String strUserName){
        driver.findElement(webUserName).sendKeys(strUserName);
        //webUserName.sendKeys(strUserName);
    }

    private void setPassword (String strPassword){

        driver.findElement(webPassword).sendKeys(strPassword);
        //webPassword.sendKeys(strPassword);
    }

    private void clickLoginButton(){

        driver.findElement(webLoginButton).click();
        //webLoginButton.click();
    }

    public String getTitle (){
        return driver.getTitle();
    }

    public void loginToiBridgeApplication (String strUserName, String strPassword) {
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLoginButton();
    }
}
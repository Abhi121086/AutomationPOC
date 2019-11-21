package testautomation.testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testautomation.maincore.Base;
import java.io.IOException;

public class LoginPage {

   private WebDriver driver;

    By webUserName;
    By webPassword;
    By webSignInButton;
    By webNextButton;
    By webStaySignInNo;
    By webCloseButtonPendingEmail;
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
        webUserName = By.xpath(objBase.getPropertyValue("Login","UserName"));
        webPassword = By.xpath(objBase.getPropertyValue("Login","Password"));
        webSignInButton = By.xpath(objBase.getPropertyValue("Login","LoginButton"));
        webNextButton = By.xpath(objBase.getPropertyValue("Login", "NextButton"));
        webStaySignInNo = By.xpath(objBase.getPropertyValue("Login", "StaySignInNo"));
        webCloseButtonPendingEmail = By.xpath(objBase.getPropertyValue("Login", "CloseButtonPendingEmail"));
    }

    private void setUserName (String strUserName){
        driver.findElement(webUserName).sendKeys(strUserName);
        //webUserName.sendKeys(strUserName);
        System.out.println("The User name entered");
        
    }

    private void setPassword (String strPassword){

        driver.findElement(webPassword).sendKeys(strPassword);
        //webPassword.sendKeys(strPassword);
        System.out.println("The Passwrod entered");
    }

    private void clickNextButton(){
        
        driver.findElement(webNextButton).click();
        System.out.println("Next Button clicked");
        //webNextButton.click();
    }

    private void clickSignInButton(){
        
            driver.findElement(webSignInButton).click();
        //webLoginButton.click();
    }

    private void StaySignInNo(){
        
        driver.findElement(webStaySignInNo).click();
    //webLoginButton.click();
    }

    private void CloseButtonPendingEmail(){
            driver.switchTo().frame("InlineDialog_Iframe");
            driver.findElement(webCloseButtonPendingEmail).click();
    //webLoginButton.click();
    }

    public String getTitle (){
        return driver.getTitle();
    }

    public void loginToApplication (String strUserName, String strPassword) {
        this.setUserName(strUserName);
        this.clickNextButton();
        this.setPassword(strPassword);
        this.clickSignInButton();
        this.StaySignInNo();
        this.CloseButtonPendingEmail();
        
    }
}
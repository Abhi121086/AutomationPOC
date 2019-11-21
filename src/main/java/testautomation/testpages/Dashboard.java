package testautomation.testpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testautomation.maincore.Base;

public class Dashboard {
    private WebDriver driver;

    By webProfileIcon;

    public Dashboard(WebDriver driver) throws IOException {
        this.driver= driver;
        Base objBase = new Base();
        webProfileIcon = By.xpath(objBase.getPropertyValue("ORProperty", "ProfileIcon"));
    }

    public void clickProfileIcon (){
        driver.findElement(webProfileIcon).click();
    }



}
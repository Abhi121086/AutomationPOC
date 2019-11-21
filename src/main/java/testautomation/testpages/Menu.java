package testautomation.testpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testautomation.maincore.Base;

public class Menu {
 //   private WebDriver driver;

    By webWorkplace;

    public Menu(WebDriver driver) throws IOException {
        Base objBase = new Base ();
       // this.driver = driver;
        webWorkplace = By.xpath(objBase.getPropertyValue("strPropertyFileName", "strPropertyKeyName"));
    }
}
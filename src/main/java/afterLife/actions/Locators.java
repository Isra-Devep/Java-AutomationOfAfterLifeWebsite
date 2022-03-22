package afterLife.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class Locators {
     static WebDriver driver;
    /// Constructor of locators
    public  Locators (WebDriver d){

        this.driver = d;
    }
    /// WebElement of searchBar
    static public WebElement searchBar(WebDriver driver){
    return driver.findElement(By.xpath("//input[ @class='gLFyf gsfi']"));
    }
    /// WebElement of Button
    static public WebElement button(WebDriver driver){
        return driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']"));
    }
    static public WebElement afterLifeLink(WebDriver driver){
        return driver.findElement(By.xpath("//h3[contains(text(),'After Life (TV Series 2019–2022) - IMDb')]"));
    }
    static public WebElement allCast(WebDriver driver){
        return driver.findElement(By.linkText("All cast & crew"));
    }




}

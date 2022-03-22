package afterLife.actions;

import net.sf.jxls.reader.XLSReader;
import net.sf.jxls.reader.XLSReaderImpl;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ActionsOnGoogle {
    static WebDriver driver;
    public ActionsOnGoogle  (WebDriver d){
        this.driver = d;
    }
    public void enterSomething(String text, WebDriver driver){
        Locators.searchBar(driver).sendKeys(text);
    }
    public void clickSearchButton(WebDriver driver){
        Locators.button(driver).submit();
    }
    public void clickAfterLifeIMDB(WebDriver driver){
        Locators.afterLifeLink(driver).click();
    }
    public void clickAllCast(WebDriver driver){
        Locators.allCast(driver).click();
    }
    public void displayAllNames(WebDriver driver){
        String name_xpathBefore = "//*[@id=\"fullcredits_content\"]/table[3]/tbody/tr[";
        String name_xpathafter = "]/td[2]/a";
        for (int i = 2; i <= 174; i = i + 2) {

            String list = driver.findElement(By.xpath(name_xpathBefore + i + name_xpathafter)).getText();
            System.out.println(list);
        }

    }
    public static void displayAllScreenNames(WebDriver driver)
    {
        String name_xpathBefore = "//*[@id=\"fullcredits_content\"]/table[3]/tbody/tr[";
        String name_xpathAfter = "]/td[4]/a[1]";
        for (int i = 2; i <= 174; i = i + 2) {

            String list = driver.findElement(By.xpath(name_xpathBefore + i + name_xpathAfter)).getText();
            System.out.println(list);
        }
    }
    public static void displayAllAppearances(WebDriver driver)
    {
        String name_xpathBefore = "//*[@id=\"fullcredits_content\"]/table[3]/tbody/tr[";
        String name_xpathAfter = "]/td[4]/a[2]";
        for (int i = 2; i <= 174; i = i + 2) {

            String list = driver.findElement(By.xpath(name_xpathBefore + i + name_xpathAfter)).getText();
            System.out.println(list);
        }
    }
   /* public static void createExcelSheet() throws IOException {
        File source  =  new File("C:\\Users\\isara raj\\Desktop\\sheet.xlsx");
        FileInputStream input = new FileInputStream(source);
        HSSFWorkbook wb = new HSSFWorkbook(input);


    }*/




}

import afterLife.actions.ActionsOnGoogle;
import net.sf.jxls.reader.XLSReader;
import net.sf.jxls.reader.XLSReaderImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
    @Test
   public void search(){
       ///creating path to open chrome
       System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
       ///creating object of chrome
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
        ActionsOnGoogle actionsOnGoogle = new ActionsOnGoogle(driver);
        actionsOnGoogle.enterSomething("Afterlife",driver);
        actionsOnGoogle.clickSearchButton(driver);
        actionsOnGoogle.clickAfterLifeIMDB(driver);
        actionsOnGoogle.clickAllCast(driver);
        actionsOnGoogle.displayAllNames(driver);
        actionsOnGoogle.displayAllScreenNames(driver);
        actionsOnGoogle.displayAllAppearances(driver);

   }



}



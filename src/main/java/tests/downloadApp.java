package tests;
import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import jarfile.myjarfile;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class downloadApp extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(downloadApp.class);
    @Test
    public void downlaod() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        //        closing the login pop up
//        driver.findElement(commonPage.crossButton).click();
        myjarfile.elementClick(driver.findElement(commonPage.crossButton));
        Thread.sleep(3000);
//        hover over more button
        WebElement more = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(more).build().perform();
        Thread.sleep(3000);
//        clicking the download button
        WebElement downApp = driver.findElement(By.xpath("//div[contains(text(),'Download App')]"));
        actions.moveToElement(downApp).click().build().perform();
        logger.info("Click on Download App Button");
//        driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/a[1]/img[1]")).click();
        myjarfile.elementClick(driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/a[1]/img[1]")));
    }
}
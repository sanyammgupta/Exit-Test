package tests;
//import Pages.DownloadAppPage;
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

public class wishlist extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(wishlist.class);
    @Test
    public void download() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(username);
        driver.findElement(LoginPage.password_field).sendKeys(password);
//        driver.findElement(LoginPage.continue_btn).click();
        myjarfile.elementClick(driver.findElement(LoginPage.continue_btn));
        Thread.sleep(3000);
        //        hover over my account button
        WebElement accMenu = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accMenu).build().perform();
        Thread.sleep(3000);
//        clicking wishlist submenu button
        WebElement wishlistBtn = driver.findElement(By.xpath("//div[contains(text(),'Wishlist')]"));
        actions.moveToElement(wishlistBtn).click().build().perform();
    }
}
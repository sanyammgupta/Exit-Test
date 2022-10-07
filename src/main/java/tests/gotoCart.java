package tests;

import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import jarfile.myjarfile;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class gotoCart extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(gotoCart.class);

    @Test
    public void cart() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(username);
        driver.findElement(LoginPage.password_field).sendKeys(password);
//        driver.findElement(LoginPage.continue_btn).click();
        myjarfile.elementClick(driver.findElement(LoginPage.continue_btn));
        Thread.sleep(2000);
//        clicking on cart button
        logger.info("Click on Cart button");
//        driver.findElement(LoginPage.gotoCart).click();
        myjarfile.elementClick(driver.findElement(LoginPage.gotoCart));
    }
}

package tests;

import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class appliances extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(appliances.class);
    @Test
    public void appliances() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(username);
        driver.findElement(LoginPage.password_field).sendKeys(password);
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(2000);
//        clicking on appliances button
        logger.info("Click on Appliances Button");
        driver.findElement(commonPage.appliances).click();
    }
}

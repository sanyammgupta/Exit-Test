package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import jarfile.myjarfile;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class gadgets extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(gadgets.class);
    @Test
    public void gadgets() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        //        closing the login pop up
//        driver.findElement(commonPage.crossButton).click();
        myjarfile.elementClick(driver.findElement(commonPage.crossButton));
        Thread.sleep(2000);
//        clicking on gadgets button
        logger.info("Click on Gadgets Button");
//        driver.findElement(commonPage.gadgets).click();
        myjarfile.elementClick(driver.findElement(commonPage.gadgets));
    }
}

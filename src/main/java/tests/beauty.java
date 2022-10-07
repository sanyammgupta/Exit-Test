package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class beauty extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(beauty.class);
    @Test
    public void beauty(){
        test.log(LogStatus.INFO,"Test Passed");
        //        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        clicking on beauty button
        logger.info("Click on Beauty button");
        driver.findElement(commonPage.beauty).click();
    }
}

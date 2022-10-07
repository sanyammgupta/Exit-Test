package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import jarfile.myjarfile;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class explorePlus extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(explorePlus.class);
    @Test
    public void plus(){
        test.log(LogStatus.INFO,"Test Passed");
//        closing the login pop up

//        driver.findElement(commonPage.crossButton).click();
        myjarfile.elementClick(driver.findElement(commonPage.crossButton));
//        clicking the explore page button
        logger.info("Click on Explore Plus button");
//        driver.findElement(commonPage.explorePlus).click();
        myjarfile.elementClick(driver.findElement(commonPage.explorePlus));
    }
}

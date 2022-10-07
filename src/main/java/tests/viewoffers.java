package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import jarfile.myjarfile;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class viewoffers extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(viewoffers.class);
    @Test
    public void offers() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        //        closing the login pop up
//        driver.findElement(commonPage.crossButton).click();
        myjarfile.elementClick(driver.findElement(commonPage.crossButton));
//        clicking offers button
//        driver.findElement(commonPage.viewmore).click();
        myjarfile.elementClick(driver.findElement(commonPage.viewmore));
        Thread.sleep(2000);
    }
}

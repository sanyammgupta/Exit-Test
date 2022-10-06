package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class topOffers extends BasePages.mainPage {
    @Test
    public void offers() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        //        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        clicking top offers button
        driver.findElement(commonPage.topOffer).click();
        Thread.sleep(2000);
    }
}

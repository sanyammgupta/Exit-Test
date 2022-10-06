package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class fashions extends BasePages.mainPage {
    @Test
    public void fashion() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        //        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
        Thread.sleep(2000);
//        clicking on two wheeler button
        driver.findElement(commonPage.fashion).click();
    }
}

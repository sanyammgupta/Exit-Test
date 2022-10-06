package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class travel extends BasePages.mainPage {
    @Test
    public void travelpage(){
        test.log(LogStatus.INFO,"Test Passed");
        //        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        clicking on travel button
        driver.findElement(commonPage.travel).click();
    }
}

package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class explorePlus extends BasePages.mainPage {
    @Test
    public void plus(){
        test.log(LogStatus.INFO,"Test Passed");
//        closing the login pop up

        driver.findElement(commonPage.crossButton).click();
//        clicking the explore page button
        driver.findElement(commonPage.explorePlus).click();
    }
}

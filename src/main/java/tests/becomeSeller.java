package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class becomeSeller extends BasePages.mainPage {
    @Test
    public void groceriespage(){
        test.log(LogStatus.INFO,"Test Passed");
//        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        click on becomeseller button
        driver.findElement(commonPage.becomeSeller).click();

    }
}

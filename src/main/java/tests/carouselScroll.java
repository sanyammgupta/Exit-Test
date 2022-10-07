package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import jarfile.myjarfile;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class carouselScroll extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(carouselScroll.class);
    @Test
    public void carousel() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
//        closing the login pop up
        logger.info("Click on Carousel next button");
//        driver.findElement(commonPage.crossButton).click();
        myjarfile.elementClick(driver.findElement(commonPage.crossButton));
//        iterate to next the carousel 5 times
        for(int i=1;i<=5;i++) {
//            driver.findElement(commonPage.carousel).click();
            myjarfile.elementClick(driver.findElement(commonPage.carousel));
            Thread.sleep(500);
        }
    }
}

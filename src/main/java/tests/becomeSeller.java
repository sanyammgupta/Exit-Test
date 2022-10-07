package tests;

import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import jarfile.myjarfile;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class becomeSeller extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(becomeSeller.class);
    @Test
    public void becomeseller(){
        test.log(LogStatus.INFO,"Test Passed");
//        closing the login pop up
//        driver.findElement(commonPage.crossButton).click();
        myjarfile.elementClick(driver.findElement(commonPage.crossButton));
//        click on becomeseller button
        logger.info("Click on Become Seller Button");
//        driver.findElement(commonPage.becomeSeller).click();
        myjarfile.elementClick((driver.findElement(commonPage.becomeSeller)));
        driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys(ReadingPropertiesFile.getProperty("mobileNumber1"));
        driver.findElement(By.xpath("//div[contains(text(),'Start Selling')]")).click();

    }
}

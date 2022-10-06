package tests;

import BasePages.LoginPage;
import BasePages.commonPage;
import BasePages.searchPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class addtoCart extends BasePages.mainPage{
    public  static Logger logger = Logger.getLogger(addtoCart.class);


    @Test
    public void addtocart() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
//        login via credentials
        logger.info("login to flipkart");
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(2000);
//        searching the item
        logger.info("Searching on flipkart");
        driver.findElement(searchPage.searchBar).sendKeys(ReadingPropertiesFile.getProperty("searchItem"));
        driver.findElement(searchPage.searchButton).click();
        Thread.sleep(2000);
//        clciking the element
        driver.findElement(commonPage.firstItem).click();
//        setting selenium to access data from new tab
        logger.info("Setup selenium to access new tab");
        Set<String> window = driver.getWindowHandles();
        Iterator<String> iterate = window.iterator();
        iterate.next();
        String secondWindow = (String)iterate.next();
        driver.switchTo().window(secondWindow);
//        adding item to cart
        logger.info("adding item to cart");
        driver.findElement(commonPage.addtoCart).click();
    }
}

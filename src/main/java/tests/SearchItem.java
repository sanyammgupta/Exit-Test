package tests;

import BasePages.commonPage;
import BasePages.searchPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import jarfile.myjarfile;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class SearchItem extends BasePages.mainPage{
    public  static Logger logger = Logger.getLogger(SearchItem.class);

    @Test
    public void search(){
        test.log(LogStatus.INFO,"Test Passed");
        //        closing the login pop up
    driver.findElement(commonPage.crossButton).click();
//    searching the item
    driver.findElement(searchPage.searchBar).sendKeys(ReadingPropertiesFile.getProperty("searchItem"));
//    driver.findElement(searchPage.searchButton).click();
        myjarfile.elementClick(driver.findElement(searchPage.searchButton));
    }
}

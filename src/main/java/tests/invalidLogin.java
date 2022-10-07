package tests;

import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import jarfile.myjarfile;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class invalidLogin extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(invalidLogin.class);

    @Test
    public void signIn() {
        test.log(LogStatus.INFO,"Test Passed");
//        login using invalid credentials
        driver.findElement(LoginPage.email_field).sendKeys(username);
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("wrong_password"));
//        driver.findElement(LoginPage.continue_btn).click();
        myjarfile.elementClick(driver.findElement(LoginPage.continue_btn));

    }
}

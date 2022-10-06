package tests;

import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLogin extends BasePages.mainPage {

    @Test
    public void signIn() {
        test.log(LogStatus.INFO,"Test Passed");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.continue_btn).click();
    }
}

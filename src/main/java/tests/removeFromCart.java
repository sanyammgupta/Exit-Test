package tests;

import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class removeFromCart extends BasePages.mainPage {

    @Test
    public void remove() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        // Login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(2000);
//        click on cart button
        driver.findElement(LoginPage.gotoCart).click();
        Thread.sleep(2000);
//        scrolling the webpage
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
//        removing the item from cart
        driver.findElement(commonPage.removeButton).click();
        driver.findElement(commonPage.removeConfirm).click();

    }
}

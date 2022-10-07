package tests;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GiftCards extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(GiftCards.class);
    @Test
    public void giftCards() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(username);
        driver.findElement(LoginPage.password_field).sendKeys(password);
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(3000);
        //        hover over my account button
        WebElement accMenu = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accMenu).build().perform();
        Thread.sleep(3000);
//        click on gift cards sub menu button
        logger.info("Click on Gift Cards Button");
        WebElement gift = driver.findElement(By.xpath("//div[contains(text(),'Gift Cards')]"));
        actions.moveToElement(gift).click().build().perform();
    }
}
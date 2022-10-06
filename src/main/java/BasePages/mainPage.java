package BasePages;

import Utilities.ExtentManager;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class mainPage {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;
    @BeforeSuite
    public void inintializeSetup() {
        String log4jPath = System.getProperty("user.dir")+ "\\log4j.properties";
        PropertyConfigurator.configure(log4jPath);


        extent = ExtentManager.getInstance("ExtentReports\\report.html");

    }

    @BeforeMethod
    public void openApplicationUrl(Method method) {

        String browser = ReadingPropertiesFile.getProperty("browser");
        String mode = ReadingPropertiesFile.getProperty("mode");
        String chromebrowser = ReadingPropertiesFile.getProperty("chrome_path");
        String firefoxbrowser = ReadingPropertiesFile.getProperty("firefox_path");
//       driver code to run the browser
        if (mode.equals("non-headless")){
            if (browser.equals("chrome")){
                System.setProperty("webdriver.chrome.driver",chromebrowser);
                driver = new ChromeDriver();
            }
            else if (browser.equals("firefox")){
                System.setProperty("webdriver.gecko.driver",firefoxbrowser);
                driver = new FirefoxDriver();
            }
            else if (browser.equals("ie")){
                System.setProperty("webdriver.ie.driver", "C:\\Users\\piyushpandey\\Downloads\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
            else System.out.println("browser name is invalid");

        }
        else if (mode.equals("headless")) {
            if (browser.equals("chrome")){
                System.setProperty("webdriver.chrome.driver",chromebrowser);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
                driver = new ChromeDriver(options);
            }
            else if (browser.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver",firefoxbrowser);
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("headless");
                driver = new FirefoxDriver(options);
            }
            else System.out.println("browser name is invalid");
        }
        driver.manage().window().maximize();

        //Go To The Application URL
        driver.get(ReadingPropertiesFile.getProperty("url"));
        test = extent.startTest(method.getName());
    }
    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        if (result.getStatus() == ITestResult.SUCCESS)
            test.log(LogStatus.PASS, "Test case got passed");
        else if (result.getStatus() == ITestResult.FAILURE) {
            test.log(LogStatus.FAIL, result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP)
            test.log(LogStatus.SKIP, result.getThrowable());
        extent.flush();
        Thread.sleep(3000);
        driver.quit();
    }
//    @AfterSuite
//    public void closeBrowser() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.quit();
//    }

}

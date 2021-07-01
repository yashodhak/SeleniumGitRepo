import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class jenkinsfirstdemoTest
{
    @Test
    public void launchFirst(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.out.println("************ Opening chrome browser ************");
        WebDriver driver = new ChromeDriver();
        System.out.println("************ Navigating to the CRED website ************ ");
        driver.get("https://cred.club/credit-cards/bill-payment-online");
        String Expectedtitle = "Credit Card Bill Payment: Pay Credit Card Bill Payment Online - CRED";
        String Actualtitle = driver.getTitle();
        System.out.println("Before Assertion " + Expectedtitle + Actualtitle);
        Assert.assertEquals(Actualtitle, Expectedtitle);
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + "\n Title matched ");
        driver.close();
        System.out.println("Checking....");
        System.out.println("************  Browser closed ************ ");
    }

    @AfterTest
    public void extentReport() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/Reports/testReport.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("Open CRED website on chrome browser");
        test.log(Status.PASS,"Opened CRED site succesfully");
        extent.flush();
    }

}

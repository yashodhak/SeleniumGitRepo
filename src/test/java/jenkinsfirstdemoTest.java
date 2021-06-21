import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class jenkinsfirstdemoTest
{
    @Test
    public void launch(){
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
        System.out.println("************  Browser closed ************ ");
    }
}

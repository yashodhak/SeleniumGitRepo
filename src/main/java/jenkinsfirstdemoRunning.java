import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class jenkinsfirstdemoRunning
{
    @Test
    public void testgooglrsearch(){

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, 20);
//it will open the goggle page
        driver.get("https://cred.club/credit-cards/bill-payment-online");
//we expect the title “Google “ should be present
        String Expectedtitle = "Credit Card Bill Payment: Pay Credit Card Bill Payment Online - CRED";
//it will fetch the actual title
        String Actualtitle = driver.getTitle();
        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
//it will compare actual title and expected title
        Assert.assertEquals(Actualtitle, Expectedtitle);
//print out the result
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
    }
}

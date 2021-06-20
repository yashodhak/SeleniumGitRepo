import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class FT {



    public static void main(String[] args) throws InterruptedException {





        WebDriver driver=new ChromeDriver();



        driver.manage().window().maximize();



        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);



        driver.get("https://cred.club/credit-cards/bill-payment-online");





    }



}
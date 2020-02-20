package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Basepage
{

    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\Browserdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");


    }
    public void closeBrowser(){
   //     driver.quit();
    }
}

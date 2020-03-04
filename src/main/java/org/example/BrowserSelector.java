package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Basepage
{
    public void openBrowser(){
        LoadProp loadProp = new LoadProp();
        String browser = loadProp.getProperty("browser");
        System.out.println("Browser : "+browser);

        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\Browserdriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\Browserdriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
        }
        else
            {
            System.out.println("You have selected wrong browser"+browser);
            }
    }
    public void closeBrowser(){
   //     driver.quit();
    }
}

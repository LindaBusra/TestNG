package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {               //Basic Driver Class


    //Driver.getDriver(); -->it is getting us driver object
    private static WebDriver driver;


    //getDriver() is used to instantiate the driver object.

    public static WebDriver getDriver() {

        if (driver == null) {   //driver is not pointing anywhere


            switch(ConfigReader.getProperty("browser")) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();        //after Selenium 4.5 we dont use it
                    break;


                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;


                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true)); //setHeadless means -->run without showing me browser
                    break;


                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
             }


         //Note: after sel 4.5
//         driver = WebDriverManager.chromedriver().create();     // or  driver = WebDriverManager.operadriver().create();

        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   //this is not hard wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));     //pageLoadTimeOut coming from Selenium
        driver.manage().window().maximize();
        return driver;


    }


    //closeDriver() is used to close the driver
    public static void closeDriver() {

        //if driver is already being used (pointing an object)
        if (driver != null) {
            driver.quit();// then quit the driver when I call closeDriver
            driver = null;//make the driver null so when we call getDriver, we can open the driver again
        }
    }



}
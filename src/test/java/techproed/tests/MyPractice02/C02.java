package techproed.tests.MyPractice02;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02 {


    @Test
    public void test(){

        //go to url : https://www.techlistic.com/p/selenium-practice-form.html
        Driver.getDriver().get(ConfigReader.getProperty("techlistic_url"));

        WebElement firstName = Driver.getDriver().findElement(By.xpath("//*[@name='firstname']"));
        firstName.sendKeys("M.Reşid",
                Keys.TAB, "Ercan", //fill the lastname
                Keys.TAB, Keys.ARROW_RIGHT, //check the gender
                Keys.TAB, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, //check the experience
                Keys.TAB, "27/12/2022", //fill the date
                Keys.TAB, Keys.TAB, Keys.SPACE, //choose your profession -> Automation Tester
                Keys.TAB, Keys.TAB,Keys.TAB, Keys.SPACE, //choose your tool -> Selenium Webdriver
                Keys.TAB, "Africa", //choose your continent -> Africa
                Keys.TAB, "Browser Commands", Keys.ENTER, //choose your command  -> Browser Commands
                Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER); //click submit button
    }

}

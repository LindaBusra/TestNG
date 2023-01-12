package techproed.tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01_AmazonTestClass {


    @Test
    public void test(){

        //go to Amazon test page
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));


        //search for Nutella
        amazonPage.searchButton.sendKeys("Nutella", Keys.ENTER);


        //verify the result contains Nutella
        String actualData = amazonPage.resultText.getText();
        String expectedData = "Nutella";
        Assert.assertTrue(actualData.contains(expectedData));


    }
}

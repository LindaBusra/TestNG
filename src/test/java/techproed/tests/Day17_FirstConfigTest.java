package techproed.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;


public class Day17_FirstConfigTest {


    @Test
    public void configTest() {


//        Driver.getDriver().get("https://www.techproeducation.com");
        Driver.getDriver().get(ConfigReader.getProperty("url_prod_techproed"));


        //Verify the title contains "Techpro Education"
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));


    }

}
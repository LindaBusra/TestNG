package techproed.tests.MyPractice01;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;


public class C01_DataProvider {

    @DataProvider
    public static Object[][] searchTheseWords() {

        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
    }


    @Test (dataProvider = "searchTheseWords")
        public void test02(String words) {

        AmazonPage amazonPage = new AmazonPage();

        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

        //java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.searchButton.sendKeys(words, Keys.ENTER);

        //sonuclarin aradigimiz kelime icerdigini test edelim
        String actualKelime = amazonPage.resultText.getText();
        Assert.assertTrue(actualKelime.contains(words));

    }


    @Test (dependsOnMethods = "test02")
    public void test03() {
        Driver.closeDriver();
    }
}
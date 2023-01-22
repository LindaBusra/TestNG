package techproed.tests.MyPractice01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import techproed.pages.HmcPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
public class C03_HotelMyCampTestClass {


    @Ignore
    @Test(groups = "gp2")
    public void test01() {

        //https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage = new HmcPage();

        /*Page class'ındaki locate'lerimize ulaşabilmek için
        Page classımızdan bir obje oluşturarak, oluşturmuş olduğumuz obje ile
        page classımızdaki locate'lerimize ulaşabiliriz
         */
        hmcPage.login.click();

        //test data username: manager ,
        //test data password : Manager1!
        hmcPage.userName.sendKeys(ConfigReader.getProperty("app_admin_username"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("app_admin_password"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.girisYapildi.isDisplayed());
        Driver.closeDriver();
    }
}
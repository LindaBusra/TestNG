package techproed.tests.MyPractice01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;


public class C02_DataProvider {

    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"erol@gmail.com","12345"},{"evren@gmail.com","45678"},{"ahmet@gmail.com","98765"}};
    }

    @Test (dataProvider = "kullanicilar")
    public void test01(String userEmail, String password) {
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //login butonuna bas
        HomePage homePage = new HomePage();
        homePage.homePageLoginLink.click();

        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        //login butonuna tiklayin
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys(userEmail);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(password)
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }
}
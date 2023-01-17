package techproed.tests.MyPractice;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import techproed.pages.FacebookPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;


public class C02_FacebookTestClass {


    @Test
    public void test01() {

        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebook_url"));


        //POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.cookies.click();
        ReusableMethods.waitFor(3);

        //Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker = new Faker();
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        facebookPage.createNewAccountButton.click();

        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.doesNotAccessText.isDisplayed());
        Driver.closeDriver();



    }


}

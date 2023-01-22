package techproed.tests.MyPractice02;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01 {

       /*
-"amazon.com" adresine gidelim
-bu web adresinin sayfa basligini(title) ve adres(url)ini yazdıralım
-title ve url'nin "spend" kelimesinin icerip icermedigini kontrol edelim
-Ardindan "trendyol.com" adresine gidelim
-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini kontrol edelim
-Bi onceki web sayfamiza geri donelim
-sayfayi yenileyelim
-Daha sonra trendyol sayfamiza tekrar donelim ve sayfayi kapatalim
    */

    @Test
    public void amazonTest(){


        //"amazon.com" adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

        //bu web adresinin sayfa basligini(title) ve adres(url)ini yazdıralım
        String url = Driver.getDriver().getCurrentUrl();
        System.out.println(url);
        String title = Driver.getDriver().getTitle();
        System.out.println(title);

        //title veya url'nin "spend" kelimesinin icerip icermedigini kontrol edelim
        Assert.assertTrue(url.contains("Spend") || title.contains("Spend"));

        //Ardindan "trendyol.com" adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("trendyol_url"));

        //bu adresin basligini alalim ve "Trend" kelimesini icerip icermedigini kontrol edelim
        String titleTrendyol = Driver.getDriver().getTitle();
        Assert.assertTrue(titleTrendyol.contains("Trend"));

        //Bi onceki web sayfamiza geri donelim
        Driver.getDriver().navigate().back();

        //sayfayi yenileyelim
        Driver.getDriver().navigate().refresh();

        //Daha sonra trendyol sayfamiza tekrar donelim ve sayfayi kapatalim
        Driver.getDriver().navigate().forward();

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}

package techproed.tests.MyPractice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class C03_Dropdown {

    //    Bir class oluşturun: DropDown
    //    https://the-internet.herokuapp.com/dropdown adresine gidin.
    //    1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    //    2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
    //    3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    //    4.Tüm dropdown değerleri(value) yazdırın
    //    5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True , degilse False yazdırın.

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }


    @Test
    public void test(){

        //    https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown");

        //    1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        //    2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());

        //    3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());

        //    4.Tüm dropdown değerleri(value) yazdırın
        List<WebElement> list = select.getOptions();

        for( WebElement w : list) {
            System.out.println(w.getText());
        }

        //    5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True , degilse False yazdırın.

        System.out.println(list.size()==4 ? "true" : "false" );
    }
}

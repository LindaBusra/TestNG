package techproed.tests.MyPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class C04_Dropdown {

// ● Bir class oluşturun: C3_DropDownAmazon
//● https://www.amazon.com/ adresine gidin.
//- Test 1
//    Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin
//-Test 2
//    1. Kategori menusunden Books secenegini  secin
//    2. Arama kutusuna Java yazin ve aratin
//    3. Bulunan sonuc sayisini yazdirin
//     4. Sonucun Java kelimesini icerdigini test edin

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }


    @Ignore
    @Test
    public void test1() {

    //https://www.amazon.com/ adresine gidin.
    driver.get("https://www.amazon.com");

    //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin
    WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));

    Select select = new Select(dropDown);

    List<WebElement> list = select.getOptions();

    int actualSize = list.size();
    int expectedSize = 45;

        Assert.assertEquals(actualSize, expectedSize, "Kategori sayısı istenilen ile uyuşmamaktadır.");

    }


    @Test
    public void test2() {

        //https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com");


        //1. Kategori menusunden Books secenegini  secin
        WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));

        Select select = new Select(dropDown);
        select.selectByVisibleText("Books");

        //2. Arama kutusuna Java yazin ve aratin
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java", Keys.ENTER);

        //3. Bulunan sonuc sayisini yazdirin
        WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span"));

        String resultText[] = result.getText().split(" ");

        System.out.println(resultText[3] + " " + resultText[4]);   //sadece rakam olark sonucu buldum

        //4. Sonucun Java kelimesini icerdigini test edin

        WebElement resultWithJava = driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        Assert.assertTrue(resultWithJava.getText().contains("Java"));
        //

    }
}
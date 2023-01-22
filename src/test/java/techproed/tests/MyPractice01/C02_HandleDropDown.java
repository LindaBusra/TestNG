package techproed.tests.MyPractice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class C02_HandleDropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }


    @Test
    public void dropdownTest() {

        //Go to Amazon
        driver.get("https://www.amazon.com");

        //Locate dropdown button
        WebElement dropDownElement = driver.findElement(By.id("searchDropdownBox"));

        //Create select object
        Select select = new Select(dropDownElement);

        //Seelct Books
        select.selectByIndex(5);


        //for print it we have to use getFirstSelectedOption()
        System.out.println(select.getFirstSelectedOption().getText());  //Books
        // select.selectByIndex();   select.selectByValue();    select.selectByVisibleText();
        // These 3 methods are void. So they don't return anything to us.

        select.selectByVisibleText("Deals");
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByValue("search-alias=arts-crafts-intl-ship");
        System.out.println(select.getFirstSelectedOption().getText());

        //all items:
        List<WebElement> optionList = select.getOptions();
        for(WebElement w : optionList) {
            System.out.println(w.getText());
        }

        //optionList.stream().forEach(t-> System.out.println(t.getText()));

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}

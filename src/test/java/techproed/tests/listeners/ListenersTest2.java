package techproed.tests.listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

// There are 2 ways to connect Listeners and Test Classes
//Use this in the test class : @Listeners(techproed.utilities.Listeners.class)
//Or Add listeners tag before test in the xml file to connect Listeners and this xml file

//@Listeners(techproed.utilities.Listeners.class)  //instead of use this, we will use xml files.
//Add listeners tag before test in the xml file to connect Listeners and this xml file

//add listener util path in the xml file
@Listeners
public class ListenersTest2 {


    @Test
    public void test1() {
        System.out.println("Test case 1 PASS");
        Assert.assertTrue(true);//PASS
    }

    @Test
    public void test2() {
        System.out.println("Test case 2 FAIL");
        Assert.assertTrue(false);//FAILS
    }

    @Test
    public void test3() {
        System.out.println("Test case 3 SKIPPED");
        throw new SkipException("SKIP THIS TEST CASE"); //we can skip like that
    }

    @Test
    public void test4() {
        System.out.println("Test case 4 No SUCH ELEMENT EXCEPTION");
        Driver.getDriver().get("https://techproeducation.com/");
        Driver.getDriver().findElement(By.xpath("asegsdgga"));//NO SUCH ELEMENT EXCEPTION
    }


}
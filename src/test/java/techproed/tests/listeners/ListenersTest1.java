package techproed.tests.listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

        /*
    https://testng.org/doc/documentation-main.html#testng-listeners

    //Listeners-->they ara interfaces  og coming from TestNG.

    1. In utilities package, create a Listeners class
    Listeners class has all ITestListeners methods. That class Implements ITestListeners interface. This is like a TestBase class
    2. Implement ITestListener
    3. Add the ITestListener Methods
    4. In tests package, create a new package : listeners
    5. In listeners package, create a new java class : ListenersTest
    6. There are 2 ways to connect Listeners and Test Classes
    Use this in the test class : @Listeners(techproed.utilities.Listeners.class)
    Or Add listeners tag before test in the xml file to connect Listeners and this xml file

    <listeners>
      <listener class-name="techproed.utilities.Listeners"></listener>
    </listeners>

     */
    //There are 2 ways to connect Listeners and Test Classes -->
    //1-Use this in the test class : @Listeners(techproed.utilities.Listeners.class)


//USE @LISTENER annotation to connect test class to the listeners
//techproed.utilities.Listeners.class-->path of listeners utility
@Listeners(techproed.utilities.Listeners.class)
public class ListenersTest1 {

    @Test
    public void test1(){
        System.out.println("Test case 1 PASS");
        Assert.assertTrue(true);//PASS
    }
    @Test
    public void test2(){
        System.out.println("Test case 2 FAIL");
        Assert.assertTrue(false);//FAILS
    }
    @Test
    public void test3(){
        System.out.println("Test case 3 SKIPPED");
        throw new SkipException("SKIP THIS TEST CASE"); //we can skip like that
    }
    @Test
    public void test4(){
        System.out.println("Test case 4 No SUCH ELEMENT EXCEPTION");
        Driver.getDriver().get("https://techproeducation.com/");
        Driver.getDriver().findElement(By.xpath("asegsdgga"));//NO SUCH ELEMENT EXCEPTION
    }



}

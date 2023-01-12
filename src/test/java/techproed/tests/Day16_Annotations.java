package techproed.tests;

import org.testng.annotations.*;

public class Day16_Annotations {
    /*
    suite > test > group > class > method
    @Test : creates test case
    @Before and @After : 10 before and after annotations. The are used to control FLOW and DESIGN of the tests
    @Ignore: Skip test case
    @Test(enable=false) : Disable the test case. By default enable = true.
    @Test(priority=number) : prioritize/order test case execution.
    NOTE: Tests that has no priorityparameter has a priority of 0.   Test(priority=0)  it should run first
    TestNG test cases runs in alhhabetical order by default.
    We should use priority when there are multiple test cases in same class.
    -3,  0(Also test with no priority), 4, 9
     */

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }


    @Test(priority = 2)
    public void test1(){
        System.out.println("test1");
    }


    @Ignore     //it is coming from testng
    @Test
    public void test2(){
        System.out.println("test2");
    }


    @Test(enabled = false)      //test3 does not executed
    public void test3(){
        System.out.println("test3");
    }


    @Test(priority = -3)            //lowest number executes first
    public void test4(){
        System.out.println("test4");
    }


    @Test(priority = 1)
    public void test5(){
        System.out.println("test5");
    }

    @Test(dependsOnMethods =  "test5")              //connect wih test5
    public void searchTest(){
        System.out.println("This is search test");
    }


    @Test
    public void test6(){
        System.out.println("test6");
    }



}

package techproed.tests;

import org.testng.annotations.Test;

public class Day16_DependsOnMethods02 {


    @Test(priority = -2)
    public void test1() {
        System.out.println("test 1");
    }


    @Test(priority = 1)
    public void test2() {
        System.out.println("test 2");
    }


    @Test(priority = 3)
    public void test3() {
        System.out.println("test 3");
    }


    @Test(priority = -1)
    public void test4() {
        System.out.println("test 4");
    }


    @Test(dependsOnMethods = "test2", priority = -2)
    public void test5() {
        System.out.println("test 5");
    }


}

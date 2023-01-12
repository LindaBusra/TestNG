package techproed.tests;

import org.testng.annotations.Test;

public class Day16_DependsOnMethods01 {


    @Test
    public void homePage(){
        System.out.println("I am on the home page");
    }



    @Test(priority = 2)         //if we use @Ignore, checkOutPage does not execute
    public void searchPage(){
        System.out.println("I am on the search page");
//        Assert.assertTrue(false);
    }

/*
    dependsOnMethods = "searchPage"  -> connecting checkOutPage to searchPage
    searchPage will execute right before checkOutPage
    If searchPage PASS -> execute checkoutPage
    If searchPage FAIL -> SKIP checkoutPage
 */

    @Test(dependsOnMethods = "searchPage")
    public void checkOutPage(){
        System.out.println("I am on the checkout page");
    }
}

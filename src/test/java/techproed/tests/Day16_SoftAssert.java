package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day16_SoftAssert {
     @Test
    public void softAssertTest(){

        SoftAssert softAssert = new SoftAssert();

        System.out.println("Line 11 code");
        softAssert.assertEquals(3,5);   //fails
        System.out.println("Line 13 code");
        softAssert.assertEquals("apple", "orange");  //fails
        System.out.println("Line 15 code");
        softAssert.assertTrue(false);       //fails
        System.out.println("Line 17 code");
        softAssert.assertAll(); //Marking the test case as Failed or Passed, if I deactived it, I can not see any fail on the console.

    }


    @Test
    public void softAssertTest2(){

        SoftAssert softAssert = new SoftAssert();

        System.out.println("Line 11 code");
        softAssert.assertEquals(5,5);   //fails
        System.out.println("Line 13 code");
        softAssert.assertEquals("apple", "apple");  //fails
        System.out.println("Line 15 code");
        softAssert.assertTrue(true);       //fails
        System.out.println("Line 17 code");
        softAssert.assertAll(); //Marking the test case as Failed or Passed, if I deactived it, I can not see any fail on the console.

    }
}

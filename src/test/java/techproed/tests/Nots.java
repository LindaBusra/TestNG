package techproed.tests;

public class Nots {

    /*
    • What is the difference between assertion(hard) and verification(soft)?
        Assertion means hard assertion. Verification means soft assertion. Verification is similar to if else statement.
        If hard assertion fails, rest of the test case stops.

    • What is the difference between soft assert and hard assert?
        Hard assertion stops execution, after assertion failure. Soft assert continues to execute even after failure
        We need to create a soft assert object to do soft assertion
        assertAll() need to be used in soft assert to make the actual result

    • Which assertion do you prefer? Why?
        I used both. Both assertion are useful. But I used hard assertion the most, because I need to fix the issue the moment it shows up. It usually doesn’t
        make sense to wait for other tests if there is a failure.
        If there are lots of test cases , I prefer to use hard assert to find the wrong test case quickly to fix it.
        If I use soft assertion, It will run all the tests every time even there are wrong cases in them. I usually use soft assertion when I write new test cases to see
        if all good or some fails.


        • We will learn 2 type of assertions:
• Hard Assertion and Soft Assertion.
• Hard Assertion: The Assertion Type You Learned in JUnit(Assert.assertEquals(),...)
◦ If this assertion fails, then the rest of the test method will stop and won’t execute the rest.
◦ As testers, we prefer hard assertion, so we can immediately check why the test case fails.



• Soft Assertion: We first create SoftAsset object then use it.
◦ Step 1: SoftAssert softAssert=new
SoftAssert();
◦ Step 2: softAssert.assertTrue();
◦ Step 3: softAssert.assertAll();

◦ IMPORTANT: assertAll() marks which soft asserts fails!!!
Use at the end.
◦ If this soft assertion fails, then the rest of the test method will continue to execute. Like if else statement.
◦ There may be certain cases where we can use soft assert.
◦ Soft assert is also known as verification.


• Both hard assert and soft assert methods are coming from testng. Usage purpose is different. Methods are same.
• Difference between Assertion(Hard Assertion) and
Verification:
◦ In case of “Assert”,if the assertion fails, test method stops to execute the rest and marked as failed.
◦ In case of “Verification”,test method continue to execute even after the assertion statement fails.


order for class: 1-prepare ConfigReader, 2-Driver, 3- configuration.properties

We can schedule with Jenkins Job... we can say run this smoke test folder 07.00 every morning. test cases mut be in the gitgub (cloud)
you give github link to Jenkins.

we have about 20 testcases in out smoke test. It depends on how long en test case is actually.
     */
}

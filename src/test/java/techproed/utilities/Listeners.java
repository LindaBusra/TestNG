package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {   //ITestListener is coming from TestNG, it is interface


    /*
        ITestListener is an interface
        We use this interface to customize testNG framework
        onStart,onFinish,onTestStart,onTestFinish,onTestSuccess,onTestFailure are special method names are used to LISTEN the test methods
        We especially use listeners for adding a special condition such as test pass, fail, or skipped
         */
    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart - Execute ONCE before ALL tests : "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish - Execute ONCE after ALL tests : "+context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart - Execute ONCE before EACH @Test : "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess - Execute AFTER EACH PASSED @Test : "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure - Execute AFTER EACH FAILED @Test : "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped - Execute AFTER EACH SKIPPED @Test : "+result.getName());
    }


    /*We are going to listen test results.
    Methods of ITestListener:  (ITestListener is an interface in TestNG):
            1-onTestStart();  It is used to run before the test starts. (it is like BeforeSuit, it runs before each test)
            2-onTestSuccess(); It is going to run only after test passes. (it is going to start after each test pass)
            3-onTestFailure(); If the test cases fail, then TestTNg will understand with the listener, then this method will be excecuted. If something is fail, it is not executed.
    4-onTestSkipped();It is going to executed after test skipped.
            5-onTestFailedBut WithinSuccessPercentage(); This is going to run after test fail, but there are specific percentage, you can put limit.
    6-onStart(); It is like beforeSuit. It will run only once before every thing begins.
    7-onFinish(); It is going to execute after everything is done. it is like afterSuit.   */
}




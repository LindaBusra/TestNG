package techproed.tests;

public class Day20_xmlFiles {

    /*
    TestNG xml files:
    xml files uses for configuration, for example pom.xml is a xml file. These used for custom settings, configuration, for add some dependincies.
    In TestNG we use xml files for custom test groups.
    For example we want to run specific test methods, or classes, or test packages, or test grups.

    For example I want to two packages, or I want to run just "excel automation" package.
    or from a files I can run just two methods. I can create test groups some classes og run them.

    xml is not just for TestNG however it is very common to use in testNG.

    xml file uses in TestNG for grouping test cases or for parallel testing or for different configurations.

    With maven we can write test cases easily.

    https://testng.org/doc/documentationmain.html#testng-xml

    What is TestNG.xml files?
    An xml file that we can  create to run specific test  cases.
    An xml file can be used for test case groups, and do configuration. For example, pom.xml is used to
    add dependencies.
    TestNG xml files are used to create custom test groups such as class level test groups, package level test groups...
    TestNG xml files are an alternative way of creating and running test cases.

    Why did we need testNG xml.file?
    It is just another way to run test groups, especially multiple test groups.

    Why do we use testNG.xml files?
    I used some  xml files  to run tests in parallel, set test priorities, and run specify groups.
    We use it to run specific test suites such as smoke testing, some end to end  testing, or regression testing.
    Certain package, class,  method
    We can also do parallel testing with TestNG

    How did you use in your current framework?
     I used some  xml files  to run tests in parallel, set test priorities, and run specify groups my current framework.



    <!--SUITE > TEST > PACKAGE > GROUPS > CLASSES > CLASS > METHODS > INCLUDE OR EXCLUDE -->

    For xm files:
    https://testng.org/doc/documentation-main.html#testng-xml


    Data Provider:
What is it?
    Data provider is a testNG functionality.
    It is used to provide test data to the test cases in automation.
    It returns the data as 2D array
    Data provider has 2 parameters : name(to override the method name) and parallel(for doing parallel testing)
How did you use it?
    I used it when I was using testNG framework. In fact, I used data provider to get some of the test data from
    the excel sheet. We store the login credentials in excel and used data provider to get the data from there.
    The benefit was I can get multiple data without any loop.

     */




}

package techproed.tests;

public class Day17_PropertiesFile {

    /*
    • Properties is a file with .properties extension
    • It holds the test data: url, username, pass, browser,..
    • This makes project clean and dynamic. We can make test data dynamic.

    • For example Instead of driver.get(“www.techproeducation.com”); we just use driver.get(url); in
    test classes.
    • We basically define key and value pairs in config file and call them in test classes (url,credentials,browser,environments,...)
            ◦ url=https://www.techproeducation.com          //url, browser.. are keys,   chrome, manager are values.
            ◦ browser=chrome
            ◦ username=manager
            ◦ password=pass
            ◦ name=Ali

    • Properties file is being used not only by testing, but also for development. Very popular.
    • To create, right click on your project->New->File -> configuration.properties


     * properties file holds test data

The point of using this file is to make the code dynamic, not hard
coded, so anyone can change the data easily and use the data
to execute their test cases.


    We create a separate java class to read from  configuration.properties file. We will use this class in our test classes.
    We use static variables and blocks.

    IQ:Where do you use static on your framework?
    Answer: In configuration reader class method and properties object static
    I also used static in my driver class. Driver object and  getDriver methods are static






*/
}

package techproed.tests.smoketest.logintests;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day18_PositiveLoginTest {

    /*

Name: US100201_Admin_Login
Description:
    User should be able login as admin
Acceptance Criteria:
    As admin, I should be able to log in the application
    https://www.bluerentalcars.com/
    Admin email: jack@gmail.com
    Admin password: 12345
     */


    HomePage homePage;
    LoginPage loginPage;


    @Test
    public void US100201_Admin_Login(){

//going blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

//        click on home page login link
        homePage = new HomePage();
        loginPage= new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();

//        sending credentials and clicking on login button
        ReusableMethods.waitFor(3);
        loginPage.email.sendKeys("jack@gmail.com");
        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys("12345");
        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);

        //Verify login is successfull
        ReusableMethods.verifyElementDisplayed(homePage.userID);
        //or alternatively we can assert if home page link is not displayed. Not recommended because it takes time.
        //ReusableMethods.verifyElementNotDisplayed(homePage.homePageLoginLink);   //it means you are in Login Page

        Driver.closeDriver();
    }
}
package techproed.tests.homework;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class UserStory5 {

    /*
    Name:
    Require user to login for reservation
    Description:
    User should see a message when user tries to book a car while not logged in
    Acceptance Criteria:
    As customer, I should be able to see error message, when I try to book a car while not logged in
    Message: Please first login
    Given user is on the login page
    And tries to book a car
    And click continue reservation
    Then user see the warning message: Please first login
     */

    HomePage homePage;
    LoginPage loginPage;



    @Test
    public void US100208_Negative_Login() throws IOException {

//        As customer, I should not be able to log in the application
        //going blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

//        click on home page login link
        homePage = new HomePage();
        loginPage = new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();


    }
}
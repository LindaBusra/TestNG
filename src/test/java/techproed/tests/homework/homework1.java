package techproed.tests.homework;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class homework1 {

    /*
    Name:
        Login screen error messages
    Description:
        User should see error message when user tries to login with incorrect credentials
    Acceptance Criteria:
        As admin or customer, I should be able to see error message,
        when I  provide a correct email address but incorrect password in a pop up window
            Error Message: Bad credentials

    https://www.bluerentalcars.com/  --> Admin email: jack@gmail.com   Admin password: 12345
     */



    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.homePageLoginLink.click();
        loginPage.userName.sendKeys("jack@gmail.com");
        loginPage.password.sendKeys("11111");
        loginPage.loginButton.click();

        //verify user should be able to see error message
        ReusableMethods.verifyElementDisplayed(loginPage.errorMessage);

    }
}

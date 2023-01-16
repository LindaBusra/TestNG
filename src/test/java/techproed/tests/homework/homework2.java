package techproed.tests.homework;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class homework2 {

    /*
    Name:
Login screen error messages
Description:
User should see error message when an invalid email is entered
Acceptance Criteria:
As admin or customer, I should be able to see error message, when I do not provide a complete valid email address in email address box
Error Message: email must be a valid email
When I enter a valid email domain, then I should not see the error message
https://email-verify.my-addr.com/list-of-most-popular-email-domains.php
     */

    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.homePageLoginLink.click();
        loginPage.userName.sendKeys("jacksongmail.com");
        loginPage.password.sendKeys("11111");
        loginPage.loginButton.click();

        //verify user should be able to see error message when user dont write valid email
        ReusableMethods.verifyElementDisplayed(loginPage.invalidEmailMessage);


        //When I enter a valid email domain, then I should not see the error message
        Driver.getDriver().navigate().refresh();
        loginPage.userName.sendKeys("jack@gmail.com");
        loginPage.password.sendKeys("12345");
        ReusableMethods.verifyElementNotDisplayed(loginPage.invalidEmailMessage);
        loginPage.loginButton.click();
    }

}

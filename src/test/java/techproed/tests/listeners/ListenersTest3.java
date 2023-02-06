package techproed.tests.listeners;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

//File-->settings-->plugins-->marketplace-->install  testng xml ->and come back and refresh
//rigt click on class-->create TestNG XML-->in creates automatically listeners2.xml file under project level
//open it, select all text-->go Code-->select reformat file-->and run


public class ListenersTest3 {
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
        loginPage.userName.sendKeys("jack@gmail.com");
        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys("1234563");//12345 is correct, SENDING INCORRECT CREDENTIAL
        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);
//        Verify login is successful
        ReusableMethods.verifyElementDisplayed(homePage.userID);
//        ALTERNATIVELY WE CAN ASSERT IF HOME PAGE LOGIN LINK IS NOT DISPLAYED. NOT RECOMMENDED
//        ReusableMethods.verifyElementNotDisplayed(homePage.homePageLoginLink);
        Driver.closeDriver();
    }
}


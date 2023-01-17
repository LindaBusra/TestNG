package techproed.tests.dataprovider;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

public class Day21_DataProvider3 {

    /*
    In this method, we will get the data from EXCEL using DATA PROVIDER.
    The only difference between class 2 and class 3 is the place where we get the data
    In class 2 we receive data from the class itself. In this class, we get the data from excel
     */
    HomePage homePage;
    LoginPage loginPage;



    @DataProvider
    public Object[][] customerData(){
//    TEST DATA. GET DATA FROM EXCEL.

        //Path of the excell sheet
        String path="./src/test/java/resources/mysmoketestdata.xlsx";
        //SheetName
        String sheetName = "customer_info";
        //Call Excel Util Class
        ExcelUtils excelUtils = new ExcelUtils(path,sheetName);

        //Use one of the excel util method to receive the data from the excel
        Object [][] customerCredentials = excelUtils.getDataArrayWithoutFirstRow();

        return customerCredentials;
    }


    //    1. Create a login method
    public void login(){

        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        homePage = new HomePage();
        loginPage =new LoginPage();
        ReusableMethods.waitFor(1);

        try {
            homePage.homePageLoginLink.click();
            ReusableMethods.waitFor(1);
        }catch (Exception e){
        }

        try{
            ReusableMethods.waitFor(1);
            homePage.userID.click();
            ReusableMethods.waitFor(1);
            homePage.logoutLink.click();
            ReusableMethods.waitFor(1);
            homePage.OK.click();
            ReusableMethods.waitFor(1);
            homePage.homePageLoginLink.click();
            ReusableMethods.waitFor(1);
        }catch (Exception e){
        }
        ReusableMethods.waitFor(1);
    }


    @Test(dataProvider = "customerData")
    public void customerLoginTest(String username, String password){
//            Takes us to the login page
        login();
        loginPage.userName.sendKeys(username);
        ReusableMethods.waitFor(1);
        loginPage.password.sendKeys(password);
        ReusableMethods.waitFor(1);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(1);
//            Verify if login is successful
//            IF USER ID IS DISPLAYED THEN LOGIN IS SUCCESSFUL
        ReusableMethods.verifyElementDisplayed(homePage.userID);


    }


    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}

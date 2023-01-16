package techproed.tests;

public class Day19_ExcelAutomationNotes {

    /*
    Excel Automation
        Apache poi library is used for working with Microsoft files
        Workbook > Sheet > Row > Cell

    ExcelUtils
        We have reusable methods
            Getting the list of data as List or Map or Array
            Getting the number of rows, or columns, or writing on the excel file…

     Data in excell  will be used in test cases.
     This testing is Data Driven Testing-->it means data driving testing

     Where do you get your testing data?
        1-BA -->anything about requrement, BRD, FRD, userstory
        2-Test Lead
        3-Tech Lead/Team lead/Dev lead
        4-Manual Tester
        5-Developer


    How do you use the data in test cases?
    I always try to use data dynamically. Some of the data source :
    External Files
        Config.properties
        Excel
        Json
        Xml
        Database
        API
        Faker

     There 5 data of username, it means 5 testcases. if I add one more, it means 6 testcases.
     More data, more testing.


    We use Excel for data drive testing.
    We get multiple data and use in our test cases
    For example, I have the application credentials in the excel sheet.
    I use that excel to get the credentials from the excel sheet.
    I store the admin credentials, manager credentials, customer service
    credentials,…

     */



}

package techproed.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;


    public class TestHomePage {     //the page after login

        public TestHomePage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath = "//*[contains(text(),'You logged into a secure area!')]")
        public WebElement loginMessage;
    }
package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestLoginPage {


    public TestLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);    //get elements from pages which driver points.
    }

    //public WebElement username = driver.findElement(By.name("username"));  traditional
    @FindBy(xpath = "//input[@name='username']")                       //or  name="username"  or xpath="//input[@name='username']"
    public WebElement userName;           //I will call them from another packages. so its is public

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;





}


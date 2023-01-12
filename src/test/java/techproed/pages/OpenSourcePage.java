package techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {

//    WebDriver driver = new ChromeDriver();


    //It is a good practice to put PageFactory in the class constructor.
    //Page factory instantiate the page object class and its elements.


    public OpenSourcePage(){

        PageFactory.initElements(Driver.getDriver(),this);    //get elements from pages which driver points.
   //driver is WebDriver, this means the page instances
    }

    //public WebElement username = driver.findElement(By.name("username"));  traditional
    @FindBy(xpath = "//input[@name='username']")                       //or  name="username"  or xpath="//input[@name='username']"
    public WebElement userName;           //I will call them from another packages. so its is public

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;


//    public void login(String user, String pass){
//
//        userName.sendKeys(user);
//        password.sendKeys(pass);
//        submitButton.click();
//
//    }


}


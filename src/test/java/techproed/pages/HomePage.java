package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class HomePage {

    //https://www.bluerentalcars.com/

    public HomePage(){  //one java class
        PageFactory.initElements(Driver.getDriver(),this);    //get elements from pages which driver points.
    }


    @FindBy(partialLinkText = "Login")
    public WebElement homePageLoginLink;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;






}


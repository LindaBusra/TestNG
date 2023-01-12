package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AmazonPage {


    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="twotabsearchtextbox")
    public WebElement searchButton;

    @FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement resultText;
    }




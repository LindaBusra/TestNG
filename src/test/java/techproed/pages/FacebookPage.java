package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class FacebookPage {


    public FacebookPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="email")
    public WebElement email;

    @FindBy(name="pass")
    public WebElement password;

    @FindBy(id="u_0_0_U3")
    public WebElement createNewAccountButton;

    @FindBy(id = "u_0_e_Wj")
    public WebElement cookies;

    @FindBy(xpath = "//*[@class='_9ay7']")
    public WebElement doesNotAccessText;

}

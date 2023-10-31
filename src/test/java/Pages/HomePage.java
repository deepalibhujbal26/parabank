package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class HomePage  extends CommonMethods {

    @FindBy(xpath = "//img[@title='ParaBank']")
    public WebElement homePageTitle;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passWord;

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerLink;

    @FindBy(xpath = "//a[normalize-space()='Forgot login info?']")
    public WebElement forgotLoginLink;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement logIn;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }


}

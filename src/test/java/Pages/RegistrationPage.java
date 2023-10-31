package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class RegistrationPage extends CommonMethods {

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerLink;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstNameField;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement lastNameField;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement addressField;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement cityField;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement stateField;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipCodeField;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phoneNumberField;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    public WebElement ssnNumberField;

    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement userNameRegisterField;

    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement passwordRegisterField;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement confirmPasswordRegisterField;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement registerButton;

    @FindBy(id="customer.username.errors")
    public WebElement customerUsernameErrors;

    @FindBy(id="customer.firstName.errors")
    public WebElement customerFirstNameError;

    @FindBy(css = ".error")
    public List<WebElement> error;

    @FindBy(linkText = "Log Out")
    public WebElement logoutLink;


    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }


}

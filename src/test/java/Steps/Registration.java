package Steps;

import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class Registration extends CommonMethods {

    public static String existingUsername;

    @When("user click on Register Link")
    public void user_click_on_register_link() {
        click(registrationPage.registerLink);
    }

    @When("user is able to enter first name as {string}")
    public void enter_first_name(String firstName) {
        sendText(registrationPage.firstNameField, firstName);
    }

    @When("user able to Enter Sign Up details in Registration page with username as {string}")
    public void user_able_to_enter_sign_up_details_in_registration_page(String username) {
        sendText(registrationPage.lastNameField, "bassi");
        sendText(registrationPage.addressField, "dontknow");
        sendText(registrationPage.cityField, "indore");
        sendText(registrationPage.stateField, "MP");
        sendText(registrationPage.zipCodeField, "4006748");
        sendText(registrationPage.phoneNumberField, "9867543212");
        sendText(registrationPage.ssnNumberField, "5678493");
        if (username.equals("random")) {
            existingUsername = generateRandomText();
            sendText(registrationPage.userNameRegisterField, existingUsername);
        } else if (username.equals("already exist")) {
            sendText(registrationPage.userNameRegisterField, existingUsername);
        } else {
            sendText(registrationPage.userNameRegisterField, username);
        }
        // sendText(registrationPage.userNameRegisterField,"parabank_user11");

        sendText(registrationPage.passwordRegisterField, "parabank#123");
        sendText(registrationPage.confirmPasswordRegisterField, "parabank#123");
    }

    @When("user click on Register Button")
    public void user_click_on_register_button() {
        click(registrationPage.registerButton);
    }

    @Then("user registration is successful")
    public void user_registration_is_successful() {
        WebElement actualMsg = driver.findElement(By.xpath("//p[contains(text(),'Your account')]"));
        String actualMessage = actualMsg.getText();
        String expectedMsg = "Your account was created successfully. You are now logged in.";
        Assert.assertEquals("Registration is not successful", expectedMsg, actualMessage);
    }


    @When("check  the username exists")
    public void check_the_username_exists() {
        String username = registrationPage.userNameRegisterField.getText();
        System.out.println(username);
    }

    @Then("verification done for usename exists")
    public void verification_done_for_usename_exists() {
        // System.out.println("");
    }

    @Then("user get the Message that userName is already exist")
    public void user_get_the_message_that_user_name_is_already_exist() throws InterruptedException {
        String actualMessage = registrationPage.customerUsernameErrors.getText();
        String expectedMsg = "This username already exists.";
        Assert.assertEquals("Username already exist message is not displayed", expectedMsg, actualMessage);
    }

    @Then("user get the Message that userName is empty")
    public void user_get_the_message_that_user_name_is_empty() throws InterruptedException {
        Thread.sleep(5000);
        String actualMessage = registrationPage.customerUsernameErrors.getText();
        String expectedMsg = "Username is required";
        Assert.assertEquals("Username is required message is not displayed", expectedMsg, actualMessage);
    }

    @Then("user get the Message that firstName is empty")
    public void user_get_the_message_that_first_name_is_empty() throws InterruptedException {
        Thread.sleep(5000);
        String actualMessage = registrationPage.customerFirstNameError.getText();
        String expectedMsg = "First name is required.";
        Assert.assertEquals("First Name is required message is not displayed", expectedMsg, actualMessage);
    }

    @And("user logs out")
    public void userLogsOut() {
        click(registrationPage.logoutLink);
    }

    @Then("verify error message as {string}")
    private void verifyErrorMessage(String errorMsg) {
        // isErrorDisplayed = false
        // loop through all error elements
        // if any element has errorMsg then return true
        // else always return false
        // Assert isErrorDisplayed is true
    }


    @When("user enter the Sign up Fields {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void user_enter_the_sign_up_fields(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNo, String SSN, String userName, String password, String confirmpwd) {

        sendText(registrationPage.firstNameField, firstName);
        sendText(registrationPage.lastNameField, lastName);
        sendText(registrationPage.addressField, address);
        sendText(registrationPage.cityField, city);
        sendText(registrationPage.stateField, state);
        sendText(registrationPage.zipCodeField, zipCode);
        sendText(registrationPage.phoneNumberField, phoneNo);
        sendText(registrationPage.ssnNumberField, SSN);
        sendText(registrationPage.userNameRegisterField, userName);
        sendText(registrationPage.passwordRegisterField, password);
        sendText(registrationPage.confirmPasswordRegisterField, confirmpwd);


    }


    @Then("user verify the Error msg {string}")
    public void user_verify_the_error_msg(String expectedErrorMessage) {
        boolean isErrorDisplayed = false;
        for (WebElement errMSg : registrationPage.error) {
            String actualErrorMsg = errMSg.getText();
            if (actualErrorMsg.equals(expectedErrorMessage)) {
                System.out.println("fields are missing " + actualErrorMsg);
                isErrorDisplayed = true;
            }
        }
        Assert.assertTrue(expectedErrorMessage + "is not Displayed", isErrorDisplayed);
    }


}

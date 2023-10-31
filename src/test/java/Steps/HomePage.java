package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.CommonMethods;

public class HomePage extends CommonMethods {

    @Then("user able to see the Home Screen")
    public void user_able_to_see_the_home_screen() {
        boolean isDisplayed = isElementDisplayed(homePage.homePageTitle);
        Assert.assertTrue("Home Page is not displayed", isDisplayed);
    }

    @Then("user able to see Customer Login ,Verifies Username and password field are display")
    public void user_able_to_see_customer_login_verifies_username_and_password_field_are_display() {
        boolean isDisplayed = isElementDisplayed(homePage.userName);
        Assert.assertTrue("Username field is not displayed", isDisplayed);
        boolean isDisplay = isElementDisplayed(homePage.passWord);
        Assert.assertTrue("Password Field is not displayed", isDisplay);
    }

    @Then("user able to see Register Link")
    public void user_able_to_see_register_link() {
        boolean isDisplayed= isElementDisplayed(homePage.registerLink);
        Assert.assertTrue("Register link is not displayed",isDisplayed);
    }

    @Then("User able see Forgot link info is display")
    public void user_able_see_forgot_link_info_is_display() {
      boolean isDisplayed= isElementDisplayed(homePage.forgotLoginLink);
      Assert.assertTrue("Forgot login info link is not displayed",isDisplayed);
    }

}

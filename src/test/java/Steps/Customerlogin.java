package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class Customerlogin extends CommonMethods {

    @When("user enters username And Password")
    public void user_enters_username_and_password() {
        //mmddyyyy_mmss

        sendText(homePage.userName, "parabank_user_ " + getTimeStamp("MMddyyyymmss"));
        sendText(homePage.passWord, "parabank#123");

    }

    @When("click on Login Button.")
    public void click_on_login_button() {

        //check username field is not empty

        click(homePage.logIn);

    }

    @When("user enters  existing username And  correct Password")
    public void user_enters_existing_username_and_correct_password() {
        sendText(homePage.userName, "parabank_user_ " + getTimeStamp("MMddyyyymmss"));
        sendText(homePage.passWord, "parabank#123");


    }

    @Then("user able to Logged In successfully")
    public void user_able_to_logged_in_successfully() {
        WebElement erroMsg= driver.findElement(By.xpath("//p[@class='error']"));
        String msg=erroMsg.getText();
        System.out.println(msg);
       // System.out.println("logged in");
    }

}

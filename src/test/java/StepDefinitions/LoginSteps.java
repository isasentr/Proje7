package StepDefinitions;

import Pages.Main;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
    Main m = new Main();

    @When("enter the username and password click sign in button")
    public void enter_the_username_and_password_click_sign_in_button() {
        m.findAndClick("signIn");
        m.findAndSend("lEmail", "group17@gmail.com");
        m.findAndSend("lPassword", "123456Group");
        m.findAndClick("signInButton");
    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {
        GWD.driverWait(2);
        m.findAndCheckText("lWelcome", "Welcome");
    }
}

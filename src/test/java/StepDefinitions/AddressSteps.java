package StepDefinitions;

import Pages.Main;
import io.cucumber.java.en.And;


public class AddressSteps {
    Main m = new Main();

    @And("user should add address successfully")
    public void user_should_add_address_successfully() {
        m.findAndCheckText("cSuccessMessage","saved");
    }
}

package StepDefinitions;

import Pages.Main;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import java.util.List;

public class AccountCreateSteps {
    Main m = new Main();

    @Given("navigate to site")
    public void navigate_to_site() {
        GWD.getDriver().get(" https://magento.softwaretestingboard.com/");
    }

    @Then("user should create account successfully")
    public void user_should_create_account_successfully() {
        m.findAndCheckText("cSuccessMessage", "Thank");
    }

    @And("click on the element")
    public void click_on_the_element(DataTable elements) {
        List<String> element = elements.asList(String.class);

        for (String s : element) {
            m.findAndClick(s);
        }
    }

    @And("user sending keys in the element")
    public void user_sending_keys_in_the_element(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (List<String> strings : listElement) {
            m.findAndSend(strings.get(0), strings.get(1));
        }
    }
}

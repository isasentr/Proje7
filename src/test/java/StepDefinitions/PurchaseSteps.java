package StepDefinitions;

import Pages.Main;
import Utilities.GWD;
import io.cucumber.java.en.Then;

public class PurchaseSteps {
    Main m = new Main();

    @Then("user should buy the item successfully")
    public void user_should_buy_the_item_successfully() {
        m.findAndClick("item");
        m.findAndClick("size");
        m.findAndClick("colour");
        m.findAndClick("addToCart");
        GWD.driverWait(2);
        m.findAndClick("showCart");
        GWD.driverWait(2);
        m.findAndClick("checkout");
        GWD.driverWait(2);
        m.findAndClick("nextButton");
        GWD.driverWait(2);
        m.findAndClick("placeOrderButton");
        GWD.driverWait(2);
        m.findAndCheckText("message","Thank");

    }
}

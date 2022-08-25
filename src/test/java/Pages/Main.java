package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main extends Parent {
    WebElement element;

    @FindBy(linkText = "Create an Account")
    private WebElement createAccount;
    @FindBy(id = "firstname")
    private WebElement cFirstName;
    @FindBy(id = "lastname")
    private WebElement cLastName;
    @FindBy(id = "email_address")
    private WebElement cAddress;
    @FindBy(id = "password")
    private WebElement cPassword;
    @FindBy(id = "password-confirmation")
    private WebElement cPasswordConfirmation;
    @FindBy(css = "button[class='action submit primary']")
    private WebElement cCreateAccountButton;
    @FindBy(css = "div[data-ui-id='message-success']")
    private WebElement cSuccessMessage;
    @FindBy(linkText = "Sign In")
    private WebElement signIn;
    @FindBy(name = "login[username]")
    private WebElement lEmail;
    @FindBy(name = "login[password]")
    private WebElement lPassword;
    @FindBy(id = "send2")
    private WebElement signInButton;
    @FindBy(css = "span[class='logged-in']")
    private WebElement lWelcome;
    @FindBy(linkText = "My Account")
    private WebElement myAccount;
    @FindBy(css = "button[class='action switch']")
    private WebElement actionSwitch;
    @FindBy(linkText = "Address Book")
    private WebElement addressBook;
    @FindBy(id = "telephone")
    private WebElement aPhoneNumber;
    @FindBy(id = "street_1")
    private WebElement aStreetAddress;
    @FindBy(css = "option[value='TR']")
    private WebElement aTrOption;
    @FindBy(id = "zip")
    private WebElement aZip;
    @FindBy(css = "button[class='action save primary']")
    private WebElement aSaveButton;
    @FindBy(name = "city")
    private WebElement aCity;
    @FindBy(css = "button[role='add-address']")
    private WebElement aNewAddress;
    @FindBy(css = "a[title='Radiant Tee']")
    private WebElement item;
    @FindBy(id = "option-label-size-143-item-166")
    private WebElement size;
    @FindBy(id = "option-label-color-93-item-50")
    private WebElement colour;
    @FindBy(id = "product-addtocart-button")
    private WebElement addToCart;
    @FindBy(css = "a[class='action showcart']")
    private WebElement showCart;
    @FindBy(id = "top-cart-btn-checkout")
    private WebElement checkout;
    @FindBy(css = "button[class='button action continue primary']")
    private WebElement nextButton;
    @FindBy(css = "button[class='action primary checkout']")
    private WebElement placeOrderButton;
    @FindBy(css = "span[data-ui-id='page-title-wrapper']")
    private WebElement message;

    public Main() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "cFirstName" -> element = cFirstName;
            case "cLastName" -> element = cLastName;
            case "cAddress" -> element = cAddress;
            case "cPassword" -> element = cPassword;
            case "cPasswordConfirmation" -> element = cPasswordConfirmation;
            case "lEmail" -> element = lEmail;
            case "lPassword" -> element = lPassword;
            case "aPhoneNumber" -> element = aPhoneNumber;
            case "aStreetAddress" -> element = aStreetAddress;
            case "aZip" -> element = aZip;
            case "aCity" -> element = aCity;
        }
        sendKeysFunction(element, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "createAccount" -> element = createAccount;
            case "cCreateAccountButton" -> element = cCreateAccountButton;
            case "signIn" -> element = signIn;
            case "signInButton" -> element = signInButton;
            case "myAccount" -> element = myAccount;
            case "aTrOption" -> element = aTrOption;
            case "aSaveButton" -> element = aSaveButton;
            case "actionSwitch" -> element = actionSwitch;
            case "addressBook" -> element = addressBook;
            case "aNewAddress" -> element = aNewAddress;
            case "item" -> element = item;
            case "size" -> element = size;
            case "colour" -> element = colour;
            case "addToCart" -> element = addToCart;
            case "showCart" -> element = showCart;
            case "checkout" -> element = checkout;
            case "nextButton" -> element = nextButton;
            case "placeOrderButton" -> element = placeOrderButton;
        }
        clickFunction(element);
    }

    public void findAndCheckText(String strElement, String text) {
        switch (strElement) {
            case "cSuccessMessage" -> element = cSuccessMessage;
            case "lWelcome" -> element = lWelcome;
            case "message" -> element = message;
        }
        verifyText(element, text);
    }
}

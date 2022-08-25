package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisibility(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element) {
        waitUntilVisibility(element);
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void waitUntilVisibility(WebElement element) {
        GWD.wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        GWD.wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyText(WebElement element, String text) {
        waitUntilVisibility(element);
        Assert.assertTrue(element.getText().contains(text));
    }
}

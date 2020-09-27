package appiumControl;

import org.openqa.selenium.By;
import ssessionManager.Session;

import java.net.MalformedURLException;

public class TextBox extends Control {
    public TextBox(By locator) {
        super(locator);
    }

    public void type(String value) throws MalformedURLException {
        Session.getInstance().getDriver().findElement(this.locator).sendKeys(value);

    }
}
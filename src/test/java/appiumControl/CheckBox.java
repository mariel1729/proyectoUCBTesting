package appiumControl;

import org.openqa.selenium.By;
import ssessionManager.Session;

import java.net.MalformedURLException;

public class CheckBox extends Control{
    public CheckBox(By locator) {
        super(locator);
    }

    public void check() throws MalformedURLException {
        Session.getInstance().getDriver().findElement(this.locator).isSelected();

    }
}

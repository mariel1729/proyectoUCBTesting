package appiumControl;

import deviceFactory.FactoryDevice;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ssessionManager.Session;

import java.net.MalformedURLException;

public class Control {

    protected WebElement control;
    //localizador que necesita el webelemnte
    protected By locator;

    public Control(By locator){
        this.locator = locator;
    }

    public void findControl() throws MalformedURLException {
        this.control = Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }

    public String getText() throws MalformedURLException {
        this.findControl();
        return control.getText();
    }

    //parea verifcar si se ve contacto
    public boolean isDisplayable() {
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

}

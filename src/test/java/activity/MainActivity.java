package activity;

import appiumControl.Button;
import org.openqa.selenium.By;
import appiumControl.Label;



public class MainActivity {
    public Button newButton;
    public Button orderButton;

    public MainActivity(){
        //accion
        newButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
       // twoButton = new Button(By.id("com.android.calculator2:id/digit_2"));
        orderButton = new Button(By.id("com.vrproductiveapps.whendo:id/home_header_icon"));

    }
    public static boolean isDisplayedNota(String titleNota){
        String locator="//android.widget.TextView[@text='"+titleNota+"']";
        Label contact = new Label(By.id(locator));

        return contact.isDisplayable();
    }
}

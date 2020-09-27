package activity;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.Label;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class OrderActivity {

    public CheckBox forPriorityNote;
    public OrderActivity() {
        forPriorityNote = new CheckBox(By.xpath("//android.widget.CheckedTextView[4]"));
    }

    public String verifyContactOrder() throws MalformedURLException {
        String locator="com.vrproductiveapps.whendo:id/home_list_item_text";
        Label contact = new Label(By.id(locator));
      return contact.getText();
       // return String.valueOf(contact);
    }
}

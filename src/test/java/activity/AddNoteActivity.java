package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class AddNoteActivity {
    public Button addNote;
    public Button addNewNote;
    public TextBox titleNote;
    public TextBox contentNote;

    public AddNoteActivity(){
        titleNote = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        contentNote= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        //add
        addNote= new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
        //addnew
        addNewNote = new Button(By.id("com.vrproductiveapps.whendo:id/saveAndNew"));
    }
}

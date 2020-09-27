package testClean;

import activity.AddNoteActivity;
import activity.MainActivity;
import activity.OrderActivity;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class BasicNote {
    MainActivity mainActivity = new MainActivity();
    AddNoteActivity addNoteActivity = new AddNoteActivity();
    OrderActivity orderActivity = new OrderActivity();

    @Test
    public void verifyAddNote() throws MalformedURLException {
        String titleNota ="Gym";
        mainActivity.newButton.click();
        //caso de prueba 1: CREAR 2 notas usando GUARDAR Y NUEVO
        // y la opcion GUARDAR
        addNoteActivity.titleNote.type(titleNota);
        addNoteActivity.contentNote.type("every day 8:00pm");
        addNoteActivity.addNewNote.click();

        addNoteActivity.titleNote.type("Class");
        addNoteActivity.contentNote.type("every day 7:am");
        addNoteActivity.addNote.click();

        String fristNote = orderActivity.verifyContactOrder();
        System.out.println("PRIMER CASO DE PRUEBA CREAR  el ultimo en crear Gym4 = "+fristNote);
        Assert.assertEquals("Gym", fristNote);
    }
    //caso de prueba 2: ORDENAR POR ORDEN ALFABETICO
    @Test
    public void verifyOrderNotes() throws MalformedURLException {
        mainActivity.orderButton.click();
        //caso de prueba 2
        orderActivity.forPriorityNote.click();
        String fristNote = orderActivity.verifyContactOrder();
        System.out.println("SEGUNDO CASO DE PRUEBA ORDENAR  El primero por Alfabeto Class= "+fristNote);
        Assert.assertEquals("Class", fristNote);
    }
}

package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContact;
import ru.stqa.pft.addressbook.model.TestBase;

public class AddContactTests extends TestBase {


    @Test
    public void testAddContact() throws Exception {
        app.gotoAddContactPage();
        app.fillContactForm(new AddContact("Ivan", "Pupkin", "Petrov", "IPP", "Voronezh"));
        app.submitContactCreation();
    }


}

package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class AddContactTests extends TestBase {


    @Test
    public void testAddContact() throws Exception {
        gotoAddContactPage();
        fillContactForm(new AddContact("Ivan", "Pupkin", "Petrov", "IPP", "Voronezh"));
        submitContactCreation();
    }


}

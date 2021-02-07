package ru.stqa.pft.addressbook.tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContact;
import ru.stqa.pft.addressbook.model.TestBase;

public class AddContactTests extends TestBase {


    @Test
    public void testAddContact() throws Exception {
        app.getNavigationHelper().gotoHomePage1();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().gotoAddContactPage();
        app.getContactHelper().fillContactForm(new AddContact("Ivan", "Pupkin", "Petrov", "IPP", "Voronezh"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoHomePage1();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);
    }


}

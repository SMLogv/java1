package ru.stqa.pft.addressbook.tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContact;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.List;

public class AddContactTests extends TestBase {


    @Test
    public void testAddContact() throws Exception {
        app.goTo().HomePage1();
        List<AddContact> before = app.contact().list();
        app.contact().gotoAddContactPage();
        app.contact().fillContactForm(new AddContact().withName("Ivan").withLastname("Pupkin")
                .withMidlename("Petrov").withNick("IPP").Address("Voronezh"));
        Thread.sleep(3000);
        app.contact().submitContactCreation();
        app.goTo().HomePage1();
        List<AddContact> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size()+1); // т.к. у 1 класса 4 td.center
    }


}

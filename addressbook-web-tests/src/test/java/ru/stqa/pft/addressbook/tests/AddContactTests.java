package ru.stqa.pft.addressbook.tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContact;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.List;
import java.util.Set;

public class AddContactTests extends TestBase {


    @Test
    public void testAddContact() throws Exception {
        app.goTo().HomePage1();
        Set<AddContact> before = app.contact().all();
        app.contact().gotoAddContactPage();
        app.contact().fillContactForm(new AddContact().withName("Ivan").withLastname("Pupkin")
                .withMidlename("Petrov").withNick("IPP").Address("Voronezh"));
        Thread.sleep(3000);
        app.contact().submitContactCreation();
        app.goTo().HomePage1();
        Set<AddContact> after = app.contact().all();
        Assert.assertEquals(after.size(), before.size()+1);
    }


}

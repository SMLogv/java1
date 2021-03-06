package ru.stqa.pft.addressbook.tests;


import org.junit.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContact;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.List;


public class EditedContactTests extends  TestBase {


    @Test
    public void testUntitledTestCase() throws InterruptedException {
        app.goTo().HomePage1();
        List<AddContact> before = app.contact().list();
        app.goTo().clicktoEditContact(0);  //последний не получается сейчас, т.к. кликается на значок, а его индекс в спимок не включал
        AddContact contact = new AddContact().withName("Mikle").withMidlename("Jakson").withLastname("ZAra")
                .withNick("IPP").Address("New York");
        app.contact().fillContactForm(contact);
        Thread.sleep(2000);
        app.goTo().clicktoSaveUpdateContact();
        app.goTo().gotoHomePage2();
        List<AddContact> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size());


        before.remove(before.size()-4);
        for (int i=0; i < after.size()-4; i++) {
            Assert.assertEquals(before.get(i), after.get(i));
        }


    }


}

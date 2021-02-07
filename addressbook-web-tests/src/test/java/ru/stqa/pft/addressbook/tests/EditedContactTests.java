package ru.stqa.pft.addressbook.tests;


import org.junit.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContact;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.List;


public class EditedContactTests extends  TestBase {


    @Test
    public void testUntitledTestCase() throws InterruptedException {
        app.getNavigationHelper().gotoHomePage1();
        List<AddContact> before = app.getContactHelper().getContactList();
        app.getNavigationHelper().clicktoEditContact(0);  //последний не получается сейчас, т.к. кликается на значок, а его индекс в спимок не включал
        app.getContactHelper().fillContactForm(new AddContact("Mikle", "Jakson", "ZAra", "IPP", "New York"));
        Thread.sleep(5000);
        app.getNavigationHelper().clicktoSaveUpdateContact();
        app.getNavigationHelper().gotoHomePage2();
        List<AddContact> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());
    }


}

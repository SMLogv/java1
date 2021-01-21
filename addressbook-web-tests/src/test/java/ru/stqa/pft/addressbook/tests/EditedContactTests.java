package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContact;
import ru.stqa.pft.addressbook.model.TestBase;


public class EditedContactTests extends  TestBase {


    @Test
    public void testUntitledTestCase() throws InterruptedException {
        app.getNavigationHelper().gotoHomePage1();
        app.getNavigationHelper().clicktoEditContact();
        app.getContactHelper().fillContactForm(new AddContact("Mikle", "Jakson", "ZAra", "IPP", "New York"));
        Thread.sleep(5000);
       app.getNavigationHelper().clicktoSaveUpdateContact();
        app.getNavigationHelper().gotoHomePage2();

    }


}

package ru.stqa.pft.addressbook.tests;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContact;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.List;


public class DeletedContactTests extends  TestBase  {

    WebDriver wd;

    @Test
    public void testUntitledTests() throws InterruptedException {
        app.getNavigationHelper().gotoHomePage1();
        List<AddContact> before = app.getContactHelper().getContactList();
        app.getNavigationHelper().ClikCheckBox(0); //последний не получается сейчас, т.к. кликается на значок, а его индекс в спимок не включал

        app.getNavigationHelper().ClickDeleteButton();
        Thread.sleep(5000);
        app.getContactHelper().ExitAlert();
        app.getNavigationHelper().gotoHomePage1();
        List<AddContact> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size()-4); // т.к. у 1 класса 4 td.center
    }




}

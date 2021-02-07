package ru.stqa.pft.addressbook.tests;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.TestBase;


public class DeletedContactTests extends  TestBase  {

    WebDriver wd;

    @Test
    public void testUntitledTests() throws InterruptedException {
        app.getNavigationHelper().gotoHomePage1();
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().ClikCheckBox(before-1);

        app.getNavigationHelper().ClickDeleteButton();
        Thread.sleep(5000);
        app.getContactHelper().ExitAlert();
        app.getNavigationHelper().gotoHomePage1();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before-1);
    }




}

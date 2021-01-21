package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.TestBase;


public class DeletedContactTests extends  TestBase  {

    WebDriver wd;

    @Test
    public void testUntitledTests() throws InterruptedException {
        app.getNavigationHelper().gotoHomePage1();
        app.getNavigationHelper().ClikCheckBox();

        app.getNavigationHelper().ClickDeleteButton();
        Thread.sleep(5000);
        app.getContactHelper().ExitAlert();


    }




}

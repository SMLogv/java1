package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.TestBase;



public class GroupEditionTests extends  TestBase {


    @Test
    public void testUntitledTestCase() throws Exception {
        app.getGroupHelper().returnToGroups();
        app.getNavigationHelper().ClikCheckBox();
        app.getGroupHelper().clicktoEditGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("Z-Imya", "Zagolovok", "Futer"));
        Thread.sleep(3000);
        app.getGroupHelper().clicktoUpdateGroup();
        Thread.sleep(3000);




    }



}

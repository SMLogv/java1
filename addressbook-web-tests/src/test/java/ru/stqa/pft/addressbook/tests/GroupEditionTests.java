package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.HashSet;
import java.util.List;


public class GroupEditionTests extends  TestBase {


    @Test
    public void testUntitledTestCase() throws Exception {
        app.getGroupHelper().returnToGroups();
        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size()-1);
        Thread.sleep(3000);
        app.getGroupHelper().clicktoEditGroup();
        GroupData group = new GroupData(before.get(before.size()-1).getId(), "Z-Imya", "Zagolovok", "Futer");
        app.getGroupHelper().fillGroupForm(group);
        Thread.sleep(3000);
        app.getGroupHelper().clicktoUpdateGroup();
        Thread.sleep(3000);
        app.getGroupHelper().returnToGroups();
        Thread.sleep(3000);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size()-1);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }



}

package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.Comparator;
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
        Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }



}

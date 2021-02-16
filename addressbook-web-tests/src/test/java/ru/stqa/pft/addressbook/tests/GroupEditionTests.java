package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.Set;


public class GroupEditionTests extends  TestBase {

    @BeforeMethod
    public void ensurePrecinditions () {
        app.goTo().groupPage();
        if (app.group().list().size() == 0){
            app.group().create(new GroupData().withName("test1"));
        }
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        Set<GroupData> before = app.group().all();
        GroupData modifiedGroup = before.iterator().next();
        GroupData group = new GroupData().
                withId(modifiedGroup.getId()).withName("Z-Imya").withHeader("Zagolovok").withFooter("Futer");
        app.group().modify(group);
        Set<GroupData> after = app.group().all();
        Assert.assertEquals(after.size(), before.size());

        before.remove(modifiedGroup);
        before.add(group);
        Assert.assertEquals(before, after);
    }




}

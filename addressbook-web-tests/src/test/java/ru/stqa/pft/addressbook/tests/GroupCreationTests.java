package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.Comparator;
import java.util.List;
import java.util.Set;


public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        app.goTo().groupPage();
        Set<GroupData> before = app.group().all();
        GroupData group =  new GroupData().withName("testARA").withHeader("").withFooter("");
        app.group().create(group);
        Set<GroupData> after = app.group().all();
        Assert.assertEquals(after.size(), before.size() +1);


       // group.setId(after.stream().max((o1, o2)  ->  Integer.compare(o1.getId(), o2.getId())).get().getId());
        // включить, если важны идентификаторы в сранении  + перегенерить иквелс и хешкод в группдата

        group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
        before.add(group);
        Assert.assertEquals(before, after);

    }
}

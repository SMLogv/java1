package ru.stqa.pft.addressbook.tests;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.*;


public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        app.goTo().groupPage();
        Groups before = app.group().all();
        GroupData group =  new GroupData().withName("testARA").withHeader("").withFooter("");
        app.group().create(group);
        Groups after = app.group().all();
        assertThat(after.size(), equalTo(before.size() +1));


       // group.setId(after.stream().max((o1, o2)  ->  Integer.compare(o1.getId(), o2.getId())).get().getId());
        // включить, если важны идентификаторы в сранении  + перегенерить иквелс и хешкод в группдата


        assertThat(after, equalTo(before.withAdded(group
                .withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    }
}

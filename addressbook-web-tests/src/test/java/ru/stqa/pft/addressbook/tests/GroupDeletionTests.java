package ru.stqa.pft.addressbook.tests;


import org.testng.*;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.TestBase;


public class GroupDeletionTests extends TestBase {



  @Test
  public void testGroupDeletion() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()){
          app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
    }
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().selectGroup(before-1);
    Thread.sleep(3000);
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    Thread.sleep(3000);
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before -1);
  }


}

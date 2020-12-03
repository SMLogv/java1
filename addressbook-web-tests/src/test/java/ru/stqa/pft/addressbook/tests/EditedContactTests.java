package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContact;
import ru.stqa.pft.addressbook.model.TestBase;

import java.time.Duration;

public class EditedContactTests extends  TestBase {
 /*   private  WebDriver wd;
    private EditedContactTests (WebDriver wd) {
        this.wd = wd;
    }  */

    @Test
    public void testUntitledTestCase() throws InterruptedException {
        app.getNavigationHelper().gotoHomePage1();
        app.getNavigationHelper().clicktoEditContact();
        app.getContactHelper().fillContactForm(new AddContact("Mikle", "Jakson", "ZAra", "IPP", "New York"));
      /*          wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("Jean");
        wd.findElement(By.xpath("//form[@action='edit.php']")).click();  */
        Thread.sleep(5000);
       app.getNavigationHelper().clicktoSaveUpdateContact();
        app.getNavigationHelper().gotoHomePage2();
       /*  wd.findElement(By.linkText("Logout")).click();    */
    }


}

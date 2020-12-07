package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.AddContact;

public class ContactHelper extends BaseHelper {

     public ContactHelper(WebDriver wd) {
       super(wd);
    }

    public void submitContactCreation() {

        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContactForm(AddContact addContact) {
     type(By.name("firstname"),(addContact.getName()));
     type(By.name("middlename"),(addContact.getMidlename()));
     type(By.name("lastname"),(addContact.getLastname()));
     type(By.name("nickname"),(addContact.getAddress()));
     type(By.name("address"), (addContact.getAddress()));
    }

    public void gotoAddContactPage() {
        click(By.linkText("add new"));
    }

    public void ClikCheckBoxContact() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void ExitAlert() {
        wd.switchTo().alert().accept();
    }

}

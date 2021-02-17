package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.AddContact;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public void ExitAlert() {
        wd.switchTo().alert().accept();
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<AddContact> list() {
        List<AddContact> contacts = new ArrayList<AddContact>();
        List<WebElement> elements = wd.findElements(By.xpath("//td[.//input]"));
        for (WebElement element : elements) {
            String name = element.getText();
            String lastname = element.getText();
            String id = element.findElement(By.tagName("input")).getAttribute("value");
            contacts.add(new AddContact().withName(name).withLastname(lastname));
        }
        return contacts;
    }

    public Set<AddContact> all() {
        Set<AddContact> groups = new HashSet<AddContact>();
        List<WebElement> elements = wd.findElements(By.xpath("//td[.//input]"));
        for (WebElement element : elements) {
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            groups.add(new AddContact().withId(id).withName(name));
        }
        return groups;
    }

}


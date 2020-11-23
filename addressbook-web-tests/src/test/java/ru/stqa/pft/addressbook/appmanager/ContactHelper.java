package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.AddContact;

public class ContactHelper {

    private WebDriver wd;

    public ContactHelper(WebDriver wd) {
        this.wd = wd;
    }


    public void submitContactCreation() {
        wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void fillContactForm(AddContact addContact) {
        wd.findElement(By.name("firstname")).sendKeys(addContact.getName());
        wd.findElement(By.name("middlename")).sendKeys(addContact.getMidlename());
        wd.findElement(By.name("lastname")).sendKeys(addContact.getLastname());
        wd.findElement(By.name("nickname")).sendKeys(addContact.getNick());
        wd.findElement(By.name("address")).sendKeys(addContact.getAddress());
    }

    public void gotoAddContactPage() {
        wd.findElement(By.linkText("add new")).click();
    }
}

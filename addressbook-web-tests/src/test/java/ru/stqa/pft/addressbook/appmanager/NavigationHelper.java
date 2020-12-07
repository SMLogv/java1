package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }


    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }
    public void gotoHomePage1() {
        click(By.linkText("home"));
    }

    public void gotoHomePage2() {
        click(By.linkText("home page"));
    }

    public void clicktoSaveUpdateContact() {
        click(By.cssSelector("input[name=\"update\"]"));
    }

    public void clicktoEditContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void ClickDeleteButton() {        wd.findElement(By.xpath("//input[@value='Delete']")).click(); }


}

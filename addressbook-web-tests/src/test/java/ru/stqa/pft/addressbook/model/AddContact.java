package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class AddContact {
    private  String id = null;
    private  String name;
    private  String midlename;
    private  String lastname;
    private  String nick;
    private  String address;

    public AddContact withId(String id) {
        this.id = id;
        return this;
    }

    public AddContact withName(String name) {
        this.name = name;
        return this;
    }

    public AddContact withMidlename(String midlename) {
        this.midlename = midlename;
        return this;
    }

    public AddContact withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public AddContact withNick(String nick) {
        this.nick = nick;
        return this;
    }

    public AddContact Address(String address) {
        this.address = address;
        return this;
    }


    @Override
    public String toString() {
        return "AddContact{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMidlename() {
        return midlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNick() {
        return nick;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddContact contact = (AddContact) o;
        return name != null ? name.equals(contact.name) : contact.name == null
                && lastname != null ? lastname.equals(contact.lastname) : contact.lastname == null
                && id != null ? id.equals(contact.id) : contact.id == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname);
    }
}

package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class AddContact {
    private final String id;
    private final String name;
    private final String midlename;
    private final String lastname;
    private final String nick;
    private final String address;

    public AddContact(String id, String name, String midlename, String lastname, String nick, String address) {
        this.id = id;
        this.name = name;
        this.midlename = midlename;
        this.lastname = lastname;
        this.nick = nick;
        this.address = address;
    }
    public AddContact( String name, String midlename, String lastname, String nick, String address) {
        this.id = null;
        this.name = name;
        this.midlename = midlename;
        this.lastname = lastname;
        this.nick = nick;
        this.address = address;
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

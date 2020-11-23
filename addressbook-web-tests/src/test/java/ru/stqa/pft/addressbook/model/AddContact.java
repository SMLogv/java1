package ru.stqa.pft.addressbook.model;

public class AddContact {
    private final String name;
    private final String midlename;
    private final String lastname;
    private final String nick;
    private final String address;

    public AddContact(String name, String midlename, String lastname, String nick, String address) {
        this.name = name;
        this.midlename = midlename;
        this.lastname = lastname;
        this.nick = nick;
        this.address = address;
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
}

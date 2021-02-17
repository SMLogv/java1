package ru.stqa.pft.addressbook.model;

import com.google.common.collect.ForwardingSet;

import java.util.HashSet;
import java.util.Set;

public class Contacts extends ForwardingSet<AddContact> {

    private Set<AddContact> delegate;

    public Contacts(Contacts contacts) {
        this.delegate=new HashSet<AddContact>(contacts.delegate);
    }

    public Contacts() {
        this.delegate=new HashSet<AddContact>();
    }


    @Override
    protected Set delegate() {
        return delegate;
    }

    public Contacts withAdded (AddContact contact) {
        Contacts contacts = new Contacts(this);
        contacts.add(contact);
        return contacts;
    }
    public Contacts without (AddContact contact) {
        Contacts contacts = new Contacts(this);
        contacts.remove(contact);
        return contacts;
    }
}

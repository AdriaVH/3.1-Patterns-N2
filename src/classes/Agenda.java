package classes;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public Agenda() {
    }

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
        }
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void displayContactsName() {
        contacts.forEach(x -> System.out.println(x.fullName()));
    }

}

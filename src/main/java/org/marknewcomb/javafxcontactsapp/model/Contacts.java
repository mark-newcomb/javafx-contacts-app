package org.marknewcomb.javafxcontactsapp.model;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private static List<Contact> contactList = new ArrayList<>();

    public void addContact(long id, String firstName, String lastName, String phone, String email){
        Contact contact = new Contact(id,firstName,lastName,phone,email);
        contactList.add(contact);
    }
    public static List<Contact> getContactList(){
        return contactList;
    }
    public static void addTestContacts(){
        contactList.add(new Contact(1,"Mark","Newcomb","562-819-7825","marknewcomb@gmail.com"));
        contactList.add(new Contact(2,"Gary","Sheppard","214-345-2244","sheppardgary@gmail.com"));
        contactList.add(new Contact(3,"Bob","Thompson","714-858-3125","bthompson@gmail.com"));
        contactList.add(new Contact(4,"Tim","Laughton","555-232-8925","timlaughton@gmail.com"));
    }
}

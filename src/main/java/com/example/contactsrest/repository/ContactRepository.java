package com.example.contactsrest.repository;

import com.example.contactsrest.entity.Contact;

import java.util.Map;

public interface ContactRepository {

    // metodi GET
    Map<Integer, Contact> getContacts();
    Contact getContact(Integer id);

    // metodi PUT
    void replaceContacts(Map<Integer, Contact> newContacts);
    void replaceContact(Integer id, Contact newContact);

    // metodo POST
    void addContact(Contact newContact);

    // metodi DELETE
    void deleteAll();
    void deleteContact(Integer id);

}

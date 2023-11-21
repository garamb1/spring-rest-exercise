package com.example.contactsrest.service;

import com.example.contactsrest.entity.Contact;
import com.example.contactsrest.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;


    public Map<Integer, Contact> getContacts() {
        return repository.getContacts();
    }

    public Contact getContact(Integer id) {
        return repository.getContact(id);
    }

    public void replaceContacts(Map<Integer, Contact> newContacts) {
        repository.replaceContacts(newContacts);
    }

    public void replaceContact(Integer id, Contact newContact) {
        repository.replaceContact(id, newContact);
    }

    public void addContact(Contact newContact) {
        repository.addContact(newContact);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public void deleteContact(Integer id) {
        repository.deleteContact(id);
    }
}

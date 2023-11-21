package com.example.contactsrest.repository;

import com.example.contactsrest.entity.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryContactRepository implements ContactRepository {

    private Map<Integer, Contact> contactMap = new HashMap<>();
    private int nextId = 0;

    @Override
    public Map<Integer, Contact> getContacts() {
        return contactMap;
    }

    @Override
    public Contact getContact(Integer id) {
        return contactMap.get(id);
    }

    @Override
    public void replaceContacts(Map<Integer, Contact> newContacts) {
        contactMap = newContacts;
        nextId = newContacts.keySet()
                .stream()
                .mapToInt(Integer::intValue)
                .max().orElse(0) + 1;
    }

    @Override
    public void replaceContact(Integer id, Contact newContact) {
        contactMap.put(id, newContact);
    }

    @Override
    public void addContact(Contact newContact) {
        contactMap.put(nextId, newContact);
    }

    @Override
    public void deleteAll() {
        contactMap = new HashMap<>();
        nextId = 0;
    }

    @Override
    public void deleteContact(Integer id) {
        contactMap.remove(id);
    }
}

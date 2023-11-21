package com.example.contactsrest.controller;

import com.example.contactsrest.entity.Contact;
import com.example.contactsrest.repository.InMemoryContactRepository;
import com.example.contactsrest.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/contacts")
public class ContactRestController {

    Logger logger = LoggerFactory.getLogger(InMemoryContactRepository.class);

    @Autowired
    private ContactService service;

    // GET /contacts
    @GetMapping("/")
    public Map<Integer, Contact> getContacts() {
        Map<Integer, Contact> contacts = service.getContacts();
        logger.info("Chiamato GET /contacts, dimensione contacts: {}", contacts.size());
        return contacts;
    }

    // PUT /contacts
    @PutMapping("/")
    public void replace(@RequestBody Map<Integer, Contact> newContacts) {
        service.replaceContacts(newContacts);
    }

    // POST /contacts
    @PostMapping("/")
    public void add(@RequestBody Contact contact) {
        service.addContact(contact);
    }

    // DELETE /contacts
    @DeleteMapping("/")
    public void delete() {
        service.deleteAll();
    }

    // GET /contacts/{id}
    @GetMapping("/{id}")
    public Contact get(@PathVariable Integer id) {
        return service.getContact(id);
    }

    // PUT /contacts/{id}
    @PutMapping("/{id}")
    public void put(@PathVariable Integer id, @RequestBody Contact newContact) {
        service.replaceContact(id, newContact);
    }

    // DELETE /contacts/{id}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteContact(id);
    }
}

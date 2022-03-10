package com.springboot.springbootfirstapp.service;

import com.springboot.springbootfirstapp.model.Contact;

import java.util.List;

public interface ContactService {
    Contact create(Contact contact);

    List<Contact> getAll();

    Contact update(Contact contact, int id);

    void delete(int id);

    List<Contact> getByKey(String key);
}

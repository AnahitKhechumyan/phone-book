package com.springboot.springbootfirstapp;

import com.springboot.springbootfirstapp.model.Contact;
import com.springboot.springbootfirstapp.model.util.Label;

public class MainTest {
    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.setId(1);
        contact.setName("Karen");
        contact.setSurname("Darbinyan");
        contact.setPhone("098156247");
        contact.setEmail("kar31100@gmail.com");
        contact.setPhoneLabel(Label.WORK);
        contact.setEmailLabel(Label.PERSONAL);


        System.out.println(contact.stringify());

    }
}


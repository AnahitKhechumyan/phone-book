package com.springboot.springbootfirstapp.repository;

import com.springboot.springbootfirstapp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact, Integer>{
}

package com.ldap.ldapintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public String index( Authentication authentication) {

        List<Person> persons = personRepository.getAllPersons();
        System.out.println("hello");
        return "Welcome to the home page!";
    }

    @GetMapping("/developer")
    public String developer( Authentication authentication) {

        List<Person> persons = personRepository.getAllPersons();
        System.out.println("developer");
        return "Welcome to the Developer home page!";
    }

}
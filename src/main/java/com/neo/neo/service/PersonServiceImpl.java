package com.neo.neo.service;


import com.neo.neo.Entitys.Person;
import com.neo.neo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hx on 2019-04-11.
 */
@Service
public class PersonServiceImpl implements PersonService {
@Autowired
    PersonRepository personRepository;
@Override
    public Person findByName(String name) {
    Person person = personRepository.findByName(name);
    return person;
}
}

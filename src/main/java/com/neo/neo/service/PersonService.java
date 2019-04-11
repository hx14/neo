package com.neo.neo.service;

import com.neo.neo.Entitys.Person;

/**
 * Created by hx on 2019-04-11.
 */
public interface PersonService {
    Person findByName(String name);
}

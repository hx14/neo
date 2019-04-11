package com.neo.neo.controller;

import com.neo.neo.Entitys.Person;
import com.neo.neo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hx on 2019-04-11.
 */
@RestController
@RequestMapping("/p")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String create(@PathVariable String name) {
        Person person = personService.findByName(name);
        String persons = "姓名是：" + person.getName() + "id是：" + person.getId() + "电话是：" + person.getPhone() + "性别是：" + person.getSex();
        return persons;
    }

}

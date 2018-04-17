package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	
@Autowired
UserRepository repository;
@RequestMapping(method=RequestMethod.GET, value="/users")
public Iterable<User> user() {
    return repository.findAll();
}

@RequestMapping(method=RequestMethod.POST, value="/users")
public String save(@RequestBody User user) {
    repository.save(user);

    return user.getId();
}




}

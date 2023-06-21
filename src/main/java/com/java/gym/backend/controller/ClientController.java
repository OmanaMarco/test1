package com.java.gym.backend.controller;

import com.java.gym.backend.entity.Client;
import com.java.gym.backend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
public class ClientController {
    @Autowired
    ClientService service;

    @GetMapping("/client/all")
    public List<Client> getLista() {
        return service.getList();
    }
    @GetMapping("client/{firstName}")
    public List<Client> getByName(@PathVariable String firstName){
        return service.getListByName(firstName);
    }
    @GetMapping("client/lastname/{lastName}")
    public List<Client> getByLastName(@PathVariable String lastName){
        return service.getListByLastName(lastName);
    }
}


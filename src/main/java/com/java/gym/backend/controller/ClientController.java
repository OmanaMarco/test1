package com.java.gym.backend.controller;

import com.java.gym.backend.entity.Client;
import com.java.gym.backend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/client")
    public Client save(@RequestBody Client client){
        return service.save(client);
    }
}


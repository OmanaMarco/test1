package com.java.gym.backend.service;

import com.java.gym.backend.entity.Client;
import com.java.gym.backend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientService {
    @Autowired
    private ClientRepository repository;


    public List<Client> getList() {
        return repository.getAll();
    }

    public List<Client> getListByName(String firstName) {
        return repository.getByName(firstName);
    }
    public List<Client> getListByLastName(String lastName) {
        return repository.getByLastName(lastName);
    }
    public Client save(Client client){
        return repository.save(client);
    }
}


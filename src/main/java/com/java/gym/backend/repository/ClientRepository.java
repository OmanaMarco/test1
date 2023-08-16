package com.java.gym.backend.repository;

import com.java.gym.backend.entity.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClientRepository {
    List<Client> lista = new ArrayList<>();

    public ClientRepository() {
        lista.add(new Client(1,"Marco", "Omana"));
        lista.add(new Client(2,"Carlos", "Sanchez"));
        lista.add(new Client(3,"Pedro", "Pascal"));
        lista.add(new Client(4,"Mariana", "Lopez"));
        lista.add(new Client(5,"Lorena", "Silva"));
        lista.add(new Client(6,"Ernesto", "Galindo"));
        lista.add(new Client(7,"Norma", "Alvarez"));
        lista.add(new Client(8,"Hector", "Perez"));
        lista.add(new Client(9,"Antonio", "Vargas"));
        lista.add(new Client(10,"Geraldine", "Diaz"));
    }

    public List<Client> getAll() {
        return lista;
    }
    public List<Client> getById(int clientId){
        return lista.stream().filter(client -> client.getCustomerId() == clientId)
                .collect(Collectors.toList());
    }

    public List<Client> getByName(String clientFirstName) {
        return lista.stream().filter(client -> client.getFirstName().equalsIgnoreCase(clientFirstName))
                .collect(Collectors.toList());
    }

    public List<Client> getByLastName(String clientLastName) {
        return lista.stream().filter(client -> client.getLastName().equalsIgnoreCase(clientLastName))
                .collect(Collectors.toList());
    }

    public Client save(Client client) {
        lista.add(client);
        return client;
    }
}
package com.java.gym.backend.repository;

import com.java.gym.backend.entity.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientRepository {
    List<Client> lista = new ArrayList<>();

    public ClientRepository() {
        lista.add(new Client("Marco", "Omana"));
        lista.add(new Client("Carlos", "Sanchez"));
        lista.add(new Client("Pedro", "Pascal"));
        lista.add(new Client("Mariana", "Lopez"));
        lista.add(new Client("Lorena", "Silva"));
        lista.add(new Client("Ernesto", "Galindo"));
        lista.add(new Client("Norma", "Alvarez"));
        lista.add(new Client("Hector", "Perez"));
        lista.add(new Client("Antonio", "Vargas"));
        lista.add(new Client("Geraldine", "Diaz"));
    }

    public List<Client> getAll() {

        return lista;
    }

    public List<Client> getByName(String clientFirstName) {
        List<Client> firstNameMatch = new ArrayList<>();
        for (Client client : lista) {
            if (client.getFirstName().equalsIgnoreCase(clientFirstName)) {
                firstNameMatch.add(client);
            }
        }
        return firstNameMatch;
        //convertir a lambda. Programacion funcional.
    }

    public List<Client> getByLastName(String clientLastName) {
        List<Client> lastNameMatch = new ArrayList<>();
        for (Client client : lista) {
            if (client.getLastName().equalsIgnoreCase(clientLastName)) {
                lastNameMatch.add(client);
            }
        }
        return lastNameMatch;
    }
}
package com.java.gym.backend.service;

import com.java.gym.backend.entity.Billing;
import com.java.gym.backend.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class BillingService {

    @Autowired
    private BillingRepository repository;

    public List<Billing> getList() {
        return repository.getAll();
    }

    public List<Billing> getByDate(String date) {
        return repository.getByDate(date);
    }

    public Billing save(Billing billing) {
        return repository.save(billing);
    }
}

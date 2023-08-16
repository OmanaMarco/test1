package com.java.gym.backend.repository;

import com.java.gym.backend.entity.Billing;
import com.java.gym.backend.entity.Client;
import com.java.gym.backend.service.BillingService;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BillingRepository {
    List<Billing> billingList = new ArrayList<>();

    public BillingRepository() {
        billingList.add(new Billing(30, "10/05/2022", LocalDateTime.now(), 0));
        billingList.add(new Billing(50, "05/08/2022", LocalDateTime.now(), 0));
        billingList.add(new Billing(30, "10/01/2023", LocalDateTime.now(), 0));
        billingList.add(new Billing(70, "05/03/2023", LocalDateTime.now(), 0));
    }

    public List<Billing> getAll() {
        return billingList;
    }

    ;

    public List<Billing> getByDate(String date) {
        return billingList.stream().filter(billing -> billing.getDate() == date).collect(Collectors.toList());
    }

    public Billing save (Billing billing){
        billingList.add(billing);
        return billing;
    }
}
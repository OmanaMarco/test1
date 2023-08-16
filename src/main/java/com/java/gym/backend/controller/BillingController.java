package com.java.gym.backend.controller;

import com.java.gym.backend.entity.Billing;
import com.java.gym.backend.entity.Client;
import com.java.gym.backend.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1")
public class BillingController {
    @Autowired
    BillingService service;

    @GetMapping("/billing/all")
    public List<Billing> getBillingList() {
        return service.getList();

    }
    @GetMapping("billing/{date}")
    public List<Billing> getByDate(@PathVariable String date) {
        return service.getByDate(date);
    }
    @PostMapping("/billing")
    public Billing save(@RequestBody Billing billing) {
        return service.save(billing);
    }
}
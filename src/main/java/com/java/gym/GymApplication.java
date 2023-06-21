package com.java.gym;

import com.java.gym.backend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymApplication implements CommandLineRunner {
	@Autowired
	ClientService service;

	public static void main(String[] args) {
		SpringApplication.run(GymApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(service.getList());
	}
}
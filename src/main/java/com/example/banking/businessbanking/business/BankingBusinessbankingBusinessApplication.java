package com.example.banking.businessbanking.business;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.banking.businessbanking.business.model.entities.BussinesCustomer;

@SpringBootApplication
public class BankingBusinessbankingBusinessApplication implements CommandLineRunner{

	public static void main(String[] args) {
		 BussinesCustomer irwin;
		SpringApplication.run(BankingBusinessbankingBusinessApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
	}

}

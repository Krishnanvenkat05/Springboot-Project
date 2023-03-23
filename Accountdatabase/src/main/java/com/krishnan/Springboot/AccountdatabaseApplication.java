package com.krishnan.Springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.krishnan.Springboot.Repository.BankdataRepository;
import com.krishnan.Springboot.model.Bankdata;

@SpringBootApplication
public class AccountdatabaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AccountdatabaseApplication.class, args);
	}
	@Autowired
	private BankdataRepository bankdataRepository;
	@Override
	public void run(String... args) throws Exception{
		this.bankdataRepository.save(new Bankdata("Krishnan", "Kanchipuram"));
	
		this.bankdataRepository.save(new Bankdata("Navaneethakannan", "Chengalpattu"));
		}

}

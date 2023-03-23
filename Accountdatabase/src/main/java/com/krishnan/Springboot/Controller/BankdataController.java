package com.krishnan.Springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishnan.Springboot.Repository.BankdataRepository;
import com.krishnan.Springboot.model.Bankdata;

@RestController
@RequestMapping("/api")
public class BankdataController {
	@Autowired
	private BankdataRepository bankdataRepository;
	
	@GetMapping("/display")
	public List<Bankdata> getDetails(){
		return this.bankdataRepository.findAll();
	}
	

}

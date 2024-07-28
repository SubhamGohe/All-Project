package com.api.marketingapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.marketingapp.Entities.Lead;
import com.api.marketingapp.repository.LeadRepository;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
	//localhost:8080/api/leads
	@Autowired
	private  LeadRepository leadRepository;
	@RequestMapping
public  List<Lead> getAllLeads(){
	List<Lead> leads = leadRepository.findAll();
	return leads;
	}
	@PostMapping
	public void saveLead(@RequestBody Lead lead) {
		leadRepository.save(lead);
	}
	
	//localhost:8080/api/leads/1"
	@DeleteMapping("/{id}")
public void  deleteOneId(@PathVariable("id")long id){
	leadRepository.deleteById(id);
	
	}
	
	//localhost:8080/api/leads/1"
	@PutMapping
 public void updateOneLead(@RequestBody LeadDto leadDto) {
	Lead I =new Lead();
	I.setId(leadDto.getId());
	I.setFirst_Name(leadDto.getFirst_Name());
	I.setLast_Name(leadDto.getLast_Name());
	I.setEmail(leadDto.getEmail());
	I.setPhone(leadDto.getPhone());
	

	}}


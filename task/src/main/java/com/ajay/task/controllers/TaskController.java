package com.ajay.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.task.entity.Cases;
import com.ajay.task.entity.Entities;
import com.ajay.task.entity.EntitiesToCases;
import com.ajay.task.service.CaseService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TaskController {
	
	
	@Autowired
	private CaseService caseService;
	
	
	@PostMapping(value = "entity") 
	public Entities addEntity(@RequestBody Entities entity){
		return caseService.saveEntity(entity);
		
	}
	
	
	@PostMapping(value = "cases") 
	public Cases addCases(@RequestBody Cases cases){
		return caseService.saveCases(cases);
		
	}
	
	@PostMapping(value = "entitytocases") 
	public EntitiesToCases addEntityToCase(@RequestBody EntitiesToCases entitytocases){
		return caseService.saveOrUpdateEntitiesToCases(entitytocases);
	}
	
	
	@PutMapping(value = "update/entitytocases") 
	public EntitiesToCases updateEntityToCase(@RequestBody EntitiesToCases entitytocases){
		return caseService.saveOrUpdateEntitiesToCases(entitytocases);
	}
	
	
	
	
	
	

}

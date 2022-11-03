package com.ajay.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.task.entity.Cases;
import com.ajay.task.entity.Entities;
import com.ajay.task.entity.EntitiesToCases;
import com.ajay.task.repository.CasesRepository;
import com.ajay.task.repository.EntityRepository;
import com.ajay.task.repository.EntityToCaseRepository;

@Service
public class CaseService {

	@Autowired
	private CasesRepository caseRepo;
	
	@Autowired
	private EntityRepository entityRepo;
	
	@Autowired
	private EntityToCaseRepository entityToCaseRepo;
	
	public Entities saveEntity(Entities entity) {
		return entityRepo.save(entity);
	}
	
	public Cases saveCases(Cases caseEntity) {
		return caseRepo.save(caseEntity);
	}
	
	public EntitiesToCases saveOrUpdateEntitiesToCases(EntitiesToCases enToCase) {
		return entityToCaseRepo.save(enToCase);
	}

}

package com.ajay.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.task.entity.Cases;

@Repository
public interface CasesRepository extends JpaRepository<Cases, Long>{

}

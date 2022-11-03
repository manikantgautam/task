package com.ajay.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.task.entity.Entities;

@Repository
public interface EntityRepository extends JpaRepository<Entities, Long>{

}

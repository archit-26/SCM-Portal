package com.prog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.prog.entity.SCM;

@Repository
public interface ScmRepo extends JpaRepository<SCM, Integer> {

	
}

package com.prog.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prog.entity.SCM;
import com.prog.repository.ScmRepo;

@Service
public class ScmService {
	
	@Autowired
	private ScmRepo repo;
	
	public void addScm(SCM s) {
		repo.save(s);
		
	}
	
	public List <SCM> getAllDetails(){
		
		return repo.findAll();	
		
	
	}
	
	public SCM getDetailsById(int id) {
		Optional<SCM> s = repo.findById(id);
		
		if(s.isPresent()) {
			return s.get();
		}
		return null;
	}
	
	public void deleteDetails(int id) {
		repo.deleteById(id);
	}
	
}

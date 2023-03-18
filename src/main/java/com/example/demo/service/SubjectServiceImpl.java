package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Subject;
import com.example.demo.repository.SubjectRepository;

@Service
public class SubjectServiceImpl {
	
    @Autowired
	public SubjectRepository subjectRepo;
    
	public List<Subject> getAllSubjects(){
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}
	
	public Subject addSubject(Subject subject){
		return subjectRepo.save(subject);
		
	}
	
	public Subject updateSubject(Integer id, Subject subject){
		return subjectRepo.save(subject);
	}

	public void deleteSubject(Integer id) {
		subjectRepo.deleteById(id);
	}

}

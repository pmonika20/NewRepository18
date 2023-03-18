package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.example.demo.bean.Subject;
import com.example.demo.service.SubjectServiceImpl;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/subject")
@Primary
public class SubjectRestController implements ISubjectRestController {
	@Autowired
	private SubjectServiceImpl subjectService;
	
	//@RequestMapping("/subject")
	@Override
	public List<Subject> getAllSubjects(){
		return subjectService.getAllSubjects();
	}
	
	
	//@RequestMapping(method=RequestMethod.POST, value="/subject")
	@Override
	public String addSubject(@RequestBody Subject subject){
		 Subject sub = subjectService.addSubject(subject);
		 if(sub != null) {
			 return "Gulllaaa record insert ho gya.";
		 }
		 return null;
	}
	
	
	//@RequestMapping(method=RequestMethod.PUT, value="/subject")
	@Override
	public String updateSubject(@PathVariable Integer id,@RequestBody Subject subject){
		Subject sub = subjectService.updateSubject(id, subject);
		if(sub != null) {
			 return "Gulllaaa record update ho gya.\n"+sub ;
		 }
		return null;
	}
	
	//@RequestMapping(method=RequestMethod.DELETE, value="/subject")
	@Override
	public String deleteSubject(@PathVariable Integer id){
		subjectService.deleteSubject(id);
		return "Record Deleted";
	}
}

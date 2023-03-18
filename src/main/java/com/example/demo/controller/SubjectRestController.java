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
	
	
	
	
	//@RequestMapping(method=RequestMethod.POST, value="/subject")
	@Override
	public String addSubject(){
		 /*Subject sub = subjectService.addSubject(subject);
		 if(sub != null) {
			 return "Gulllaaa record insert ho gya.";
		 }*/
		 return "Azure deployment doneeeee";
	}
	
	
	
}

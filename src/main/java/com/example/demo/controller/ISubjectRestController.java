package com.example.demo.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.Subject;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
@ResponseBody
public interface ISubjectRestController {

	@GetMapping(path = "getAllSubjects")
	//@ApiOperation(response = List.class, value = "getAllSubjects")
	List<Subject> getAllSubjects();


    @PostMapping(path = "addSubject", consumes = MediaType.APPLICATION_JSON_VALUE)
	//@ApiOperation(response = List.class, value = "addSubject")
	String addSubject(
			/* @ApiParam(required = false, value = "subject") */ @RequestBody(required = false) Subject subject);

    @PutMapping(path = "updateSubject/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
   //@ApiOperation(response = List.class, value = "updateSubject")
	String updateSubject(
			/* @ApiParam(value ="id", required = true) */ @PathVariable(required = false, value = "id") Integer id,
			/* @ApiParam(required = false, value = "subject") */ @RequestBody(required = false) Subject subject);

    @DeleteMapping(path = "deleteSubject/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
   	//@ApiOperation(response = List.class, value = "deleteSubject")
	String deleteSubject(
			/* @ApiParam(value ="id", required = true) */ @PathVariable(required = false, value ="id") Integer id);

}

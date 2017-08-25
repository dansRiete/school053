package com.school053.journal.java.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school053.journal.java.dto.ChildMarkDto;
import com.school053.journal.java.service.ChildMarkService;

@RestController
@RequestMapping("/mark")
public class ChildMarkRest {
	
	@Autowired
	private ChildMarkService childMarkService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/fetchBySubjectId", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<List<ChildMarkDto>> fetchBySubjectId(@RequestParam(value = "childId", required = false) String childId,
															   @RequestParam(value = "subjectId", required = false) String subjectId){
		return ResponseEntity.ok(childMarkService.fetchBySubjectId(childId, subjectId));
	}
}

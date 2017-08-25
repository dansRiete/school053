package com.school053.journal.java.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.school053.journal.java.dto.ChildMarkDto;
import com.school053.journal.java.service.ChildMarkService;

@RestController
@RequestMapping("/mark")
public class ChildMarkRest {
	
	@Autowired
	private ChildMarkService childMarkService;
	
	@GetMapping(value = "/fetchBySubjectId")
	public ResponseEntity<List<ChildMarkDto>> fetchBySubjectId(@RequestParam(value = "childId", required = false) String childId,
															   @RequestParam(value = "subjectId", required = false) String subjectId){
		return ResponseEntity.ok(childMarkService.fetchBySubjectId(childId, subjectId));
	}
}

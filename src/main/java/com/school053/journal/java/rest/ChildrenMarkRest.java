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
@RequestMapping("/api/marks")
public class ChildrenMarkRest {
	
	private final ChildMarkService childMarkService;

	@Autowired
	public ChildrenMarkRest(ChildMarkService childMarkService) {
		this.childMarkService = childMarkService;
	}

	@RequestMapping(value = "/fetchBySubject", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<List<ChildMarkDto>> fetchMarksBySubjectAndChild(
			@RequestParam(value = "childId") String childId,
			@RequestParam(value = "subjectId") String subjectId
	){
		return ResponseEntity.ok(childMarkService.fetchBySubjectId(childId, subjectId));
	}

	@RequestMapping(value = "/fetchByChild", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<List<ChildMarkDto>> fetchMarksBySubjectAndChild(
			@RequestParam(value = "childId") String childId
	){
		return ResponseEntity.ok(childMarkService.fetchByChild(childId));
	}
}

package com.school053.journal.java.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.school053.journal.java.dto.LessonEventDto;
import com.school053.journal.java.service.LessonEventService;

@RestController
@RequestMapping("/api/lesson-events")
public class LessonEventsRest {

	private final LessonEventService lessonEventService;

	@Autowired
	public LessonEventsRest(LessonEventService lessonEventService) {
		this.lessonEventService = lessonEventService;
	}


	@GetMapping(value = "/fetchAll")
	public ResponseEntity<List<LessonEventDto>> fetchAll() {
		return ResponseEntity.ok(lessonEventService.fetchAll());
	}
	
	@GetMapping(value = "/fetchBySubjectId")
	public ResponseEntity<List<LessonEventDto>> fetchBySubjectId(@RequestParam(value = "subjectId", required = false) String subjectId){
		return ResponseEntity.ok(lessonEventService.fetchBySubjectId(subjectId));
	}
}

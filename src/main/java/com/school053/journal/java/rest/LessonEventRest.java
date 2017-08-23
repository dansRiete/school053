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

import com.school053.journal.java.dto.LessonEventDto;
import com.school053.journal.java.service.LessonEventService;

@RestController
@RequestMapping("/lesson-event")
public class LessonEventRest {

	@Autowired
	private LessonEventService lessonEventService;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<List<LessonEventDto>> getLessonEvent() {
		return ResponseEntity.ok(lessonEventService.getLessonEvents());
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/getBySubject", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<List<LessonEventDto>> getLessonEventsBy(@RequestParam(value = "subjectId", required = false) String subjectId){
		return ResponseEntity.ok(lessonEventService.getLessonEventsBy(subjectId));
	}
}
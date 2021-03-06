package com.school053.journal.java.service;

import java.util.List;

import com.school053.journal.java.dto.LessonEventDto;

public interface LessonEventService {
	
	public List<LessonEventDto> fetchAll();
	
	public List<LessonEventDto> fetchBySubjectId(String subject);
	
}

package com.school053.journal.java.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.school053.journal.java.dao.LessonEventDao;
import com.school053.journal.java.dto.LessonEventDto;
import com.school053.journal.java.mapper.LessonEventMapper;
import com.school053.journal.java.service.LessonEventService;

public class LessonEventServiceImpl implements LessonEventService{

	@Autowired
	private LessonEventDao lessonEventDao;
	
	@Override
	public List<LessonEventDto> getLessonEvents() {
		return lessonEventDao.findAll().stream() 
				.map(LessonEventMapper.MAPPER :: toDto).collect(Collectors.toList());
		
	}
}

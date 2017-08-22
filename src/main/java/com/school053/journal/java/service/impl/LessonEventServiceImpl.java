package com.school053.journal.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.school053.journal.java.dao.LessonEventDao;
import com.school053.journal.java.model.events.LessonEvent;
import com.school053.journal.java.service.LessonEventService;

public class LessonEventServiceImpl implements LessonEventService{

	@Autowired
	private LessonEventDao lessonEventDao;
	
	@Override
	public List<LessonEvent> getLessonEvents() {
		return lessonEventDao.findAll();
	}
}

package com.school053.journal.java.dao;

import java.util.List;

import com.school053.journal.java.model.events.LessonEvent;

public interface LessonEventDao extends InterfaceDao<LessonEvent>{
	
	public List<LessonEvent> findLessonEventsBy(String subjectId);
	
}

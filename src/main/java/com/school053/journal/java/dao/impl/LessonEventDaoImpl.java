package com.school053.journal.java.dao.impl;

import org.springframework.stereotype.Repository;

import com.school053.journal.java.dao.AbstractDao;
import com.school053.journal.java.dao.LessonEventDao;
import com.school053.journal.java.model.events.LessonEvent;

@Repository(value="LessonEventDao")
public class LessonEventDaoImpl extends AbstractDao<LessonEvent> implements LessonEventDao{
	
}

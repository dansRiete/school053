package com.school053.journal.java.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school053.journal.java.dao.LessonEventDao;
import com.school053.journal.java.dto.LessonEventDto;
import com.school053.journal.java.mapper.LessonEventMapper;
import com.school053.journal.java.service.LessonEventService;

@Service
public class LessonEventServiceImpl implements LessonEventService {

	@Autowired
	private LessonEventDao lessonEventDao;

	@Override
	public List<LessonEventDto> getLessonEvents() {
		return lessonEventDao.findAll().stream().map(Mappers.getMapper(LessonEventMapper.class)::toDto)
				.collect(Collectors.toList());
	}

	@Override
	public List<LessonEventDto> getLessonEventsBy(final String subjectId) {
		return lessonEventDao.findLessonEventsBy(subjectId).stream().map(Mappers.getMapper(LessonEventMapper.class)::toDto)
				.collect(Collectors.toList());
	}
}
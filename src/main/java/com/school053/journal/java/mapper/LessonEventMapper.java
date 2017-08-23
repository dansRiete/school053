package com.school053.journal.java.mapper;

import java.time.LocalDate;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.school053.journal.java.dto.LessonEventDto;
import com.school053.journal.java.model.events.LessonEvent;

@Mapper(uses= {LocalDate.class})
public interface LessonEventMapper {
	LessonEventMapper MAPPER = Mappers.getMapper(LessonEventMapper.class);
	
	LessonEventDto toDto(LessonEvent lessonEvent);
	
	@InheritInverseConfiguration
	LessonEvent fromDto(LessonEventDto lessonEventDto);
}

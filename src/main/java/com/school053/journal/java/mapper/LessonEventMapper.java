package com.school053.journal.java.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.school053.journal.java.dto.LessonEventDto;
import com.school053.journal.java.model.events.LessonEvent;

@Mapper
public interface LessonEventMapper {
	@Mappings({ @Mapping(target = "id", source = "lessonEvent.id"),
			@Mapping(target = "comment", source = "lessonEvent.comment"),
			@Mapping(target = "date", source = "lessonEvent.eventDate",   dateFormat = "dd.MM.yyyy")})
	LessonEventDto toDto(LessonEvent lessonEvent);
}

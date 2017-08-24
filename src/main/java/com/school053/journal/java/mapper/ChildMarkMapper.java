package com.school053.journal.java.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.school053.journal.java.dto.ChildMarkDto;
import com.school053.journal.java.model.events.ChildMark;

@Mapper
public interface ChildMarkMapper {
	
	@Mappings({
		@Mapping(target = "id", source = "childMark.id"),
		@Mapping(target = "mark", source = "childMark.mark"),
		@Mapping(target = "childFirstName", source = "childMark.child.firstName"),
		@Mapping (target = "lessonEventTypeName", source = "childMark.lessonEventType.name")
	})
	ChildMarkDto toDto(ChildMark childMark);
}

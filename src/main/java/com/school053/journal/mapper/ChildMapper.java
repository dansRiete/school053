package com.school053.journal.mapper;

import com.school053.journal.dto.ChildDto;
import com.school053.journal.model.users.Child;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChildMapper {
    ChildMapper MAPPER = Mappers.getMapper(ChildMapper.class);

    ChildDto toDto(Child child);
}

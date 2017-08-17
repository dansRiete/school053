package com.school053.journal.mapper;

import com.school053.journal.dto.SubjectDto;
import com.school053.journal.model.events.Subject;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectDtoMapper {
    SubjectDtoMapper MAPPER = Mappers.getMapper(SubjectDtoMapper.class);

    SubjectDto toDto(Subject subject);

    @InheritInverseConfiguration
    Subject fromDto(SubjectDto subjectDto);
}

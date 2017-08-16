package com.school053.journal.mapper;

import com.school053.journal.dto.SubjectDto;
import com.school053.journal.model.events.Subject;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectMapper {
    SubjectMapper MAPPER = Mappers.getMapper(SubjectMapper.class);

    SubjectDto toDto(Subject subject);

    @InheritInverseConfiguration
    Subject fromDto(SubjectDto subjectDto);
}

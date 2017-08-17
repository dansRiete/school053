package com.school053.journal.java.mapper;

import com.school053.journal.java.dto.ClassDto;
import com.school053.journal.java.model.users.SchoolClass;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClassMapper {
    ClassMapper MAPPER = Mappers.getMapper(ClassMapper.class);

    @Mappings({
            @Mapping(target = "curatorLastName", source = "schoolClass.curator.lastName"),
            @Mapping(target = "curatorFirstName", source = "schoolClass.curator.firstName")
    })
    ClassDto toDto(SchoolClass schoolClass);

    @InheritInverseConfiguration
    SchoolClass fromDto(ClassDto classDto);
}

package com.school053.journal.java.mapper;

import com.school053.journal.java.dto.SchoolClassDto;
import com.school053.journal.java.model.users.SchoolClass;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SchoolClassMapper {
    SchoolClassMapper MAPPER = Mappers.getMapper(SchoolClassMapper.class);

    @Mappings({
            @Mapping(target = "curatorLastName", source = "schoolClass.curator.lastName"),
            @Mapping(target = "curatorFirstName", source = "schoolClass.curator.firstName")
    })
    SchoolClassDto toDto(SchoolClass schoolClass);

    @InheritInverseConfiguration
    SchoolClass fromDto(SchoolClassDto classDto);
}

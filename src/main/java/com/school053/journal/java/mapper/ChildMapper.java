package com.school053.journal.java.mapper;

import com.school053.journal.java.dto.ChildDto;
import com.school053.journal.java.model.users.Child;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ClassMapper.class})
public interface ChildMapper {
    ChildMapper MAPPER = Mappers.getMapper(ChildMapper.class);

    ChildDto toDto(Child child);

    @InheritInverseConfiguration
    Child fromDto(ChildDto childDto);
}

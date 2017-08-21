package com.school053.journal.java.mapper;

import com.school053.journal.java.dto.ParentDto;
import com.school053.journal.java.model.users.Parent;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by Aleks on 21.08.2017.
 */
@Mapper
public interface ParentMapper {
    ParentMapper MAPPER = Mappers.getMapper(ParentMapper.class);
    ParentDto toDto(Parent parent);
    @InheritInverseConfiguration
    Parent fromDto(ParentDto parentDto);
}

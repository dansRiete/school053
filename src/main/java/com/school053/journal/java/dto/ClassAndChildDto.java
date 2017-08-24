package com.school053.journal.java.dto;

import com.school053.journal.java.mapper.ChildMapper;
import com.school053.journal.java.mapper.SchoolClassMapper;
import com.school053.journal.java.model.users.SchoolClass;
import com.school053.journal.java.model.users.Child;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClassAndChildDto {

    private List<SchoolClassDto> classDtoList = new ArrayList<>();
    private List<ChildDto> childDtoList = new ArrayList<>();

    public ClassAndChildDto() {}

    public ClassAndChildDto(List<SchoolClass> classList, List<Child> childList) {
        this.classDtoList = classList.stream().map(SchoolClassMapper.MAPPER :: toDto).collect(Collectors.toList());
        this.childDtoList = childList.stream().map(ChildMapper.MAPPER :: toDto).collect(Collectors.toList());
    }

    public List<SchoolClassDto> getClassDtoList() {
        return classDtoList;
    }

    public void setClassDtoList(List<SchoolClassDto> classDtoList) {
        this.classDtoList = classDtoList;
    }

    public List<ChildDto> getChildDtoList() {
        return childDtoList;
    }

    public void setChildDtoList(List<ChildDto> childDtoList) {
        this.childDtoList = childDtoList;
    }
}

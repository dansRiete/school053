package com.school053.journal.java.dto;

import com.school053.journal.java.mapper.ChildMapper;
import com.school053.journal.java.mapper.ClassMapper;
import com.school053.journal.java.model.users.SchoolClass;
import com.school053.journal.java.model.users.Child;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClassAndChildDto {

    private List<ClassDto> classDtoList = new ArrayList<>();
    private List<ChildDto> childDtoList = new ArrayList<>();

    public ClassAndChildDto() {}

    public ClassAndChildDto(List<SchoolClass> classList, List<Child> childList) {
        this.classDtoList = classList.stream().map(ClassMapper.MAPPER :: toDto).collect(Collectors.toList());
        this.childDtoList = childList.stream().map(ChildMapper.MAPPER :: toDto).collect(Collectors.toList());
    }

    public List<ClassDto> getClassDtoList() {
        return classDtoList;
    }

    public void setClassDtoList(List<ClassDto> classDtoList) {
        this.classDtoList = classDtoList;
    }

    public List<ChildDto> getChildDtoList() {
        return childDtoList;
    }

    public void setChildDtoList(List<ChildDto> childDtoList) {
        this.childDtoList = childDtoList;
    }
}

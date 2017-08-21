package com.school053.journal.java.service;

import com.school053.journal.java.dto.ClassDto;
import com.school053.journal.java.model.users.SchoolClass;

import java.util.List;

public interface ClassService {
    List<ClassDto> getClasses();
    List<SchoolClass> getAllActive();
    void add(ClassDto classDto);
}

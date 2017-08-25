package com.school053.journal.java.service;

import com.school053.journal.java.dto.SchoolClassDto;

import java.util.List;

public interface SchoolClassService {
    List<SchoolClassDto> getClasses();
    void add(SchoolClassDto SchoolClassDto);
    List<SchoolClassDto> findActiveByName();
}

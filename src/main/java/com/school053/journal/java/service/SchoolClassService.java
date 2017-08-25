package com.school053.journal.java.service;

import com.school053.journal.java.dto.SchoolClassDto;

import java.util.List;

public interface SchoolClassService {
    List<SchoolClassDto> fetchAll();
    void create(SchoolClassDto SchoolClassDto);
    List<SchoolClassDto> fetchAllActiveByName();
}

package com.school053.journal.java.service.impl;

import com.school053.journal.java.dao.SchoolClassDao;
import com.school053.journal.java.dto.SchoolClassDto;
import com.school053.journal.java.mapper.SchoolClassMapper;
import com.school053.journal.java.model.users.SchoolClass;
import com.school053.journal.java.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolClassServiceImpl implements SchoolClassService {

    private final SchoolClassDao schoolClassDao;

    @Autowired
    public SchoolClassServiceImpl(SchoolClassDao schoolClassDao) {
        this.schoolClassDao = schoolClassDao;
    }

    @Override
    public List<SchoolClassDto> getClasses() {
        return schoolClassDao.findAll().stream().
                map(SchoolClassMapper.MAPPER :: toDto).collect(Collectors.toList());
    }

    @Transactional
    public void add(SchoolClassDto classDto) {
        SchoolClass schoolClass = SchoolClassMapper.MAPPER.fromDto(classDto);
        schoolClassDao.create(schoolClass);
    }

    @Override
    public List<SchoolClassDto> findActiveByName() {
        return schoolClassDao.findActiveByName().stream()
                .map(SchoolClassMapper.MAPPER :: toDto).collect(Collectors.toList());
    }
}

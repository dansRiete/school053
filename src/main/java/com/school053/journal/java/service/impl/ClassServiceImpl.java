package com.school053.journal.java.service.impl;

import com.school053.journal.java.dao.ClassDao;
import com.school053.journal.java.dto.ClassDto;
import com.school053.journal.java.mapper.ClassMapper;
import com.school053.journal.java.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    public ClassDao classDao;

    @Override
    public List<ClassDto> getClasses() {
        return classDao.findAll().stream().map(ClassMapper.MAPPER :: toDto).collect(Collectors.toList());
    }
}

package com.school053.journal.service.impl;

import com.school053.journal.dao.SubjectDao;
import com.school053.journal.dto.SubjectDto;
import com.school053.journal.mapper.SubjectMapper;
import com.school053.journal.model.events.Subject;
import com.school053.journal.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    public SubjectDao subjectDao;

    public void setSubjectDao(SubjectDao subjectDao) {
        this.subjectDao = subjectDao;
    }

    public SubjectDao getSubjectDao() {
        return subjectDao;
    }

    @Override
    public void createSubject(Subject subject) {

    }

    @Override
    public void deleteSubjectById(int id) {

    }

    @Override
    public SubjectDto getSubject(String id) {
        return SubjectMapper.MAPPER.toDto(subjectDao.findOne(id));
    }

    @Override
    public List<SubjectDto> getSubjects() {
        return subjectDao
                .findAll()
                .stream()
                .map(SubjectMapper.MAPPER :: toDto)
                .collect(Collectors.toList());
    }
}

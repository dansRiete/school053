package com.school053.journal.java.service.impl;

import com.school053.journal.java.dao.ChildDao;
import com.school053.journal.java.dto.ChildDto;
import com.school053.journal.java.mapper.ChildMapper;
import com.school053.journal.java.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    private ChildDao childDao;

    @Override
    public List<ChildDto> getChildren() {
        return childDao.findAll().stream().map(ChildMapper.MAPPER :: toDto).collect(Collectors.toList());
    }

    @Override
    public ChildDto getById(int id) {
        return null;
    }

    @Override
    public void createChild(com.school053.journal.java.model.users.Child child) {

    }

    @Override
    public void deleteChild(int id) {

    }
}

package com.school053.journal.java.service.impl;

import com.school053.journal.java.dao.ChildDao;
import com.school053.journal.java.dto.ChildDto;
import com.school053.journal.java.mapper.ChildMapper;
import com.school053.journal.java.model.users.Child;
import com.school053.journal.java.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChildServiceImpl implements ChildService {

    private final ChildDao childDao;

    @Autowired
    public ChildServiceImpl(ChildDao childDao) {
        this.childDao = childDao;
    }

    @Override
    public List<ChildDto> fetchAll() {
        return childDao.fetchAll().stream().map(ChildMapper.MAPPER :: toDto).collect(Collectors.toList());
    }

    @Override
    public List<ChildDto> fetchByParent(String parentId) {
        return childDao.fetchByParent(parentId).stream().map(ChildMapper.MAPPER :: toDto).collect(Collectors.toList());
    }

    @Override
    public void create(Child child) {
        //todo
    }

    @Override
    public void delete(int id) {
        //todo
    }

    @Override
    public List<ChildDto> fetchByClass(String id) {
        return childDao.fetchByClass(id).stream().map(ChildMapper.MAPPER :: toDto).collect(Collectors.toList());
    }
}

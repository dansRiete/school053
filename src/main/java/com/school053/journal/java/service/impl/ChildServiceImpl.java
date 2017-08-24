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

    @Autowired
    private ChildDao childDao;

    @Override
    public List<ChildDto> getChildren() {
        return childDao.findAll().stream().map(ChildMapper.MAPPER :: toDto).collect(Collectors.toList());
    }

    @Override
    public ChildDto getById(int id) {
        return null;//todo
    }

    @Override
    public List<ChildDto> getByParent(String parentId) {
        return childDao.getChildrenByParent(parentId).stream().map(ChildMapper.MAPPER :: toDto).collect(Collectors.toList());
    }

    @Override
    public void createChild(Child child) {
        //todo
    }

    @Override
    public void deleteChild(int id) {
        //todo
    }

    @Override
    public List<Child> getAllActive() {
        return childDao.findAll();
    }

    @Override
    public List<ChildDto> getChildrenByClass(String id) {
        return childDao.getChildrenByClass(id).stream().map(ChildMapper.MAPPER :: toDto).collect(Collectors.toList());
    }
}

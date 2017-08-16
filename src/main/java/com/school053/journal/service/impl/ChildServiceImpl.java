package com.school053.journal.service.impl;

import com.school053.journal.dao.ChildDao;
import com.school053.journal.dto.ChildDto;
import com.school053.journal.mapper.ChildDtoMapper;
import com.school053.journal.model.users.Child;
import com.school053.journal.service.ChildService;
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
        return childDao.findAll().stream().map(ChildDtoMapper.MAPPER :: toDto).collect(Collectors.toList());
    }

    @Override
    public Child getById(int id) {
        return null;
    }

    @Override
    public void createChild(Child child) {

    }

    @Override
    public void deleteChild(int id) {

    }
}

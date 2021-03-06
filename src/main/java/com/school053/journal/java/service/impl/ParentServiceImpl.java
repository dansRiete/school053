package com.school053.journal.java.service.impl;
import com.school053.journal.java.dao.ParentDao;
import com.school053.journal.java.model.users.Parent;
import com.school053.journal.java.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ParentServiceImpl implements ParentService {

    private final ParentDao parentDao;

    @Autowired
    public ParentServiceImpl(ParentDao parentDao) {
        this.parentDao = parentDao;
    }

    @Override
    public List<Parent> fetchAll() {
        return parentDao.fetchAll();
    }
}

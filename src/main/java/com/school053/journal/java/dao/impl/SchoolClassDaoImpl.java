package com.school053.journal.java.dao.impl;

import com.school053.journal.java.dao.AbstractDao;
import com.school053.journal.java.dao.SchoolClassDao;
import com.school053.journal.java.model.users.SchoolClass;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "SchoolClassDao")
public class SchoolClassDaoImpl extends AbstractDao<SchoolClass> implements SchoolClassDao {

    @Override
    public List<SchoolClass> findActiveByName() {
        return entityManager
                .createNamedQuery(SchoolClass.FIND_ACTIVE_BY_NAME, SchoolClass.class)
                .getResultList();
    }
}

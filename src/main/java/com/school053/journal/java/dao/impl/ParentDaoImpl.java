package com.school053.journal.java.dao.impl;

import com.school053.journal.java.dao.AbstractDao;
import com.school053.journal.java.dao.ParentDao;
import com.school053.journal.java.model.users.Parent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Aleks on 21.08.2017.
 */
@Repository(value = "ParentDao")
public class ParentDaoImpl extends AbstractDao<Parent> implements ParentDao {

    @Override
    public List<Parent> fetchAll() {
        return entityManager
                .createNamedQuery(Parent.FIND_ACTIVE, Parent.class)
                .getResultList();
    }
}

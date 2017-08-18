package com.school053.journal.java.dao.impl;
import com.school053.journal.java.dao.AbstractDao;
import com.school053.journal.java.dao.ChildDao;
import com.school053.journal.java.model.users.Child;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "ChildDao")
public class ChildDaoImpl extends AbstractDao<Child> implements ChildDao {

    public List<Child> getActiveChildren() {
        return entityManager
                .createNamedQuery(Child.FIND_ACTIVE, Child.class)
                .getResultList();
    }

    public List<Child> getChildrenByClass(String classId) {
        return entityManager
                .createNamedQuery(Child.FIND_BY_CLASS, Child.class)
                .setParameter("classId", classId)
                .getResultList();
    }

}
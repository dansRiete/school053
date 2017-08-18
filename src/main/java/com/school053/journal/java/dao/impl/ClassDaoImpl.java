package com.school053.journal.java.dao.impl;

import com.school053.journal.java.dao.AbstractDao;
import com.school053.journal.java.dao.ClassDao;
import com.school053.journal.java.model.users.SchoolClass;
import org.springframework.stereotype.Repository;

@Repository(value = "ClassDao")
public class ClassDaoImpl extends AbstractDao<SchoolClass> implements ClassDao {
}

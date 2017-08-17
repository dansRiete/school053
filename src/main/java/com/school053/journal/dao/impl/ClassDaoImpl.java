package com.school053.journal.dao.impl;

import com.school053.journal.dao.AbstractDao;
import com.school053.journal.dao.ClassDao;
import com.school053.journal.model.users.SchoolClass;
import org.springframework.stereotype.Repository;

@Repository(value = "ClassDao")
public class ClassDaoImpl extends AbstractDao<SchoolClass> implements ClassDao {
}

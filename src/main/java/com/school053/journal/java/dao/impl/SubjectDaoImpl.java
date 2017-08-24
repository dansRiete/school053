package com.school053.journal.java.dao.impl;

import com.school053.journal.java.dao.AbstractDao;
import com.school053.journal.java.dao.SubjectDao;
import com.school053.journal.java.model.events.Subject;
import com.school053.journal.java.model.users.SchoolClass;
import org.springframework.stereotype.Repository;
import sun.security.krb5.SCDynamicStoreConfig;

import java.util.List;

@Repository
public class SubjectDaoImpl extends AbstractDao<Subject> implements SubjectDao {
}

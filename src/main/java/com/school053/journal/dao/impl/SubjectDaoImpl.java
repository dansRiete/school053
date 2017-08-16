package com.school053.journal.dao.impl;

import com.school053.journal.dao.AbstractDao;
import com.school053.journal.dao.SubjectDao;
import com.school053.journal.model.events.Subject;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectDaoImpl extends AbstractDao<Subject> implements SubjectDao {
}

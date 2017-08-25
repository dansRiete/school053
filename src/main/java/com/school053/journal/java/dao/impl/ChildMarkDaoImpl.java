package com.school053.journal.java.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.school053.journal.java.dao.AbstractDao;
import com.school053.journal.java.dao.ChildMarkDao;
import com.school053.journal.java.model.events.ChildMark;

@Repository(value = "ChildMarkDao")
public class ChildMarkDaoImpl extends AbstractDao<ChildMark> implements ChildMarkDao {

	@Override
	public List<ChildMark> fetchBySubjectId(String childId, String subjectId) {
		return entityManager.createNamedQuery(ChildMark.GET_BY_CHILD_AND_SUBJECT,ChildMark.class)
				.setParameter("childId", childId).setParameter("subjectId", subjectId)
				.getResultList();
	}
}

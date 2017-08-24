package com.school053.journal.java.dao.impl;

import java.util.List;

import com.school053.journal.java.dao.AbstractDao;
import com.school053.journal.java.dao.ChildMarkDao;
import com.school053.journal.java.model.events.ChildMark;

public class ChildMarkDaoImpl extends AbstractDao<ChildMark> implements ChildMarkDao {

	@Override
	public List<ChildMark> findBy(String childId, String subjectId) {
		return entityManager.createNamedQuery(ChildMark.GET_BY_CHILD_AND_SUBJECT,ChildMark.class)
				.setParameter("childId", childId).setParameter("subjectId", subjectId)
				.getResultList();
	}
}

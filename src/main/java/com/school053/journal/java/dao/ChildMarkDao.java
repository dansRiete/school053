package com.school053.journal.java.dao;

import java.util.List;

import com.school053.journal.java.model.events.ChildMark;

public interface ChildMarkDao extends InterfaceDao<ChildMark> {
	
	List<ChildMark> fetchBySubjectId(String childId, String subjectId);

    List<ChildMark> fetchByChild(String childId);
}

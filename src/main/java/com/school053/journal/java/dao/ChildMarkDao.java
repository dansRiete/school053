package com.school053.journal.java.dao;

import java.util.List;

import com.school053.journal.java.dto.ChildMarkDto;
import com.school053.journal.java.model.events.ChildMark;

public interface ChildMarkDao extends InterfaceDao<ChildMark> {
	
	List<ChildMarkDto> findBy(String childId, String subjectId);

}

package com.school053.journal.java.service;

import java.util.List;

import com.school053.journal.java.dto.ChildMarkDto;

public interface ChildMarkService {
	
	List<ChildMarkDto> fetchBySubjectId(String childId, String subjectId);
	List<ChildMarkDto> fetchByChild(String childId);

}

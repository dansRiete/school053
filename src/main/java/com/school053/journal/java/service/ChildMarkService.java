package com.school053.journal.java.service;

import java.util.List;

import com.school053.journal.java.dto.ChildMarkDto;

public interface ChildMarkService {
	
	List<ChildMarkDto> getBy(String childId, String subjectId);
	
}

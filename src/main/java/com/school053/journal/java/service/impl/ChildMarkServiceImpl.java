package com.school053.journal.java.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school053.journal.java.dao.ChildMarkDao;
import com.school053.journal.java.dto.ChildMarkDto;
import com.school053.journal.java.mapper.ChildMarkMapper;
import com.school053.journal.java.service.ChildMarkService;

import javax.transaction.Transactional;

@Service
public class ChildMarkServiceImpl implements ChildMarkService {

	private final ChildMarkDao childMarkDao;

	@Autowired
	public ChildMarkServiceImpl(ChildMarkDao childMarkDao) {
		this.childMarkDao = childMarkDao;
	}

	@Override
	public List<ChildMarkDto> fetchBySubjectId(String childId, String subjectId) {
		return childMarkDao.fetchBySubjectId(childId, subjectId).stream()
				.map(Mappers.getMapper(ChildMarkMapper.class)::toDto).collect(Collectors.toList());
	}

	@Override
	@Transactional
	public List<ChildMarkDto> fetchByChild(String childId) {
		return childMarkDao.fetchByChild(childId).stream()
				.map(Mappers.getMapper(ChildMarkMapper.class)::toDto).collect(Collectors.toList());
	}
}

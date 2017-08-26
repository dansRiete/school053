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

@Service
public class ChildMarkServiceImpl implements ChildMarkService {

	private final ChildMarkDao childMarkDao;

	@Autowired
	public ChildMarkServiceImpl(ChildMarkDao childMarkDao) {
		this.childMarkDao = childMarkDao;
	}

	@Override
	public List<ChildMarkDto> getBy(String childId, String subjectId) {
		return childMarkDao.findBy(childId, subjectId).stream().map(Mappers.getMapper(ChildMarkMapper.class)::toDto)
				.collect(Collectors.toList());
	}
}

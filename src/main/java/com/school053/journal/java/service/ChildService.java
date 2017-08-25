package com.school053.journal.java.service;

import com.school053.journal.java.dto.ChildDto;
import com.school053.journal.java.model.users.Child;

import java.util.List;

public interface ChildService {
    List<ChildDto> fetchAll();
    List<ChildDto> fetchAllByParent(String parentId);
    void create(Child child);
    void delete(int id);
    List<ChildDto> fetchAllByClass(String id);
}
package com.school053.journal.java.service;

import com.school053.journal.java.dto.ChildDto;
import com.school053.journal.java.model.users.Child;
import com.school053.journal.java.model.users.SchoolClass;

import java.util.List;

public interface ChildService {
    List<ChildDto> getChildren();
    ChildDto getById(int id);
    void createChild(com.school053.journal.java.model.users.Child child);
    void deleteChild(int id);
    List<Child> getAllActive();
    List<ChildDto> getChildrenByClass(String id);
}
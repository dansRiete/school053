package com.school053.journal.service;

import com.school053.journal.dto.ChildDto;
import com.school053.journal.model.users.Child;

import java.util.List;

public interface ChildService {
    List<ChildDto> getChildren();
    Child getById(int id);
    void createChild(Child child);
    void deleteChild(int id);
}
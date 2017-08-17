package com.school053.journal.service;

import com.school053.journal.dto.ChildDto;
import com.school053.journal.model.users.Child;

import java.util.List;

public interface ChildService {
    List<ChildDto> getChildren();
    ChildDto getById(int id);
    void createChild(com.school053.journal.model.users.Child child);
    void deleteChild(int id);
}
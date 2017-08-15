package com.school053.journal.dao;

import com.school053.journal.model.users.Child;

import java.util.List;

public interface ChildDao extends InterfaceDao<Child> {

    List<Child> getActiveChildren();
    List<Child> getChildrenByClass(String classId);
}

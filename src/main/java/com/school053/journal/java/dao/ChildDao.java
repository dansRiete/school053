package com.school053.journal.java.dao;

import com.school053.journal.java.model.users.Child;

import java.util.List;

public interface ChildDao extends InterfaceDao<Child> {
	
    List<Child> fetchAllActive();
    List<Child> fetchAllByClass(String classId);
    List<Child> fetchAllByParent(String parentId);
}

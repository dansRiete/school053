package com.school053.journal.java.dao;

import com.school053.journal.java.model.users.Child;

import java.util.List;

public interface ChildDao extends InterfaceDao<Child> {
	
    List<Child> fetchActive();
    List<Child> fetchByClass(String classId);
    List<Child> fetchByParent(String parentId);
}

package com.school053.journal.java.dao;

import com.school053.journal.java.model.users.SchoolClass;

import java.util.List;

public interface SchoolClassDao extends InterfaceDao<SchoolClass> {
    List<SchoolClass> fetchAllActiveByName();
}

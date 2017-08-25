package com.school053.journal.java.dao;

import java.util.List;

public interface InterfaceDao<T> {

    T fetch(String id);
    List<T> fetchAll();
    void create(T entity);
    T update(T entity);
    void delete(T entity);
    void delete(String entityId);

}

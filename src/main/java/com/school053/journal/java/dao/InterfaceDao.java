package com.school053.journal.java.dao;

import java.util.List;

public interface InterfaceDao<T> {

    T find(String id);

    List<T> findAll();

    void create(T entity);

    T update(T entity);

    void delete(T entity);

    void delete(String entityId);

}

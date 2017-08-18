package com.school053.journal.java.dao;

import java.util.List;

public interface InterfaceDao<T> {

    T findOne(String id);

    List<T> findAll();

    void create(T entity);

    T update(T entity);

    void delete(T entity);

    void deleteById(String entityId);

}

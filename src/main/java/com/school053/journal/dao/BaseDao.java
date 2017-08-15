package com.school053.journal.dao;

import com.school053.journal.model.events.ChildMark;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

/**
 * Created by Aleks on 15.08.2017.
 */
public interface BaseDao {
    List<ChildMark> getAllMarks();
}

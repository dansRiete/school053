package com.school053.journal.java.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.school053.journal.java.configuration.AppConfig;
import com.school053.journal.java.configuration.HibernateConfiguration;
import com.school053.journal.java.configuration.WebConfiguration;
import com.school053.journal.java.service.LessonEventService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,
classes = { AppConfig.class, HibernateConfiguration.class, WebConfiguration.class })

public class ChildServiceImplTest {

	@Autowired
	private LessonEventService lessonEventService;

	@Test
	public void testGetChildren() {
		assertNotNull(lessonEventService);
	}

}

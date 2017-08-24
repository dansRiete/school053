package com.school053.journal.java.dto;

public class ChildMarkDto {
	private String id;
	private String mark;
	private String childFirstName;
	private String lessonEventTypeName;
	
	public ChildMarkDto() {
	}

	public ChildMarkDto(String id, String mark, String childFirstName, String lessonEventTypeName) {
		this.id = id;
		this.mark = mark;
		this.childFirstName = childFirstName;
		this.lessonEventTypeName = lessonEventTypeName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getChildFirstName() {
		return childFirstName;
	}

	public void setChildFirstName(String childFirstName) {
		this.childFirstName = childFirstName;
	}

	public String getLessonEventTypeName() {
		return lessonEventTypeName;
	}

	public void setLessonEventTypeName(String lessonEventTypeName) {
		this.lessonEventTypeName = lessonEventTypeName;
	}
}

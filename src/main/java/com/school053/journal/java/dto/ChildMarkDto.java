package com.school053.journal.java.dto;

public class ChildMarkDto {
	private String id;
	private String date;
	private String mark;
	private String lessonEventTypeName;
	
	public ChildMarkDto() {
	}

	public ChildMarkDto(String id, String date, String mark, String lessonEventTypeName) {
		this.id = id;
		this.date = date;
		this.mark = mark;
		this.lessonEventTypeName = lessonEventTypeName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getLessonEventTypeName() {
		return lessonEventTypeName;
	}

	public void setLessonEventTypeName(String lessonEventTypeName) {
		this.lessonEventTypeName = lessonEventTypeName;
	}
}

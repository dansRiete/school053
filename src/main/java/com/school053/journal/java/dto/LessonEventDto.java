package com.school053.journal.java.dto;

public class LessonEventDto {
	private String id;
	private String comment;
	private String date;
	
	public LessonEventDto() {
	}

	public LessonEventDto(String id, String comment, String date) {
		this.id = id;
		this.comment = comment;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}

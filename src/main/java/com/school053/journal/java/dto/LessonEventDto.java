package com.school053.journal.java.dto;

import java.time.LocalDate;

public class LessonEventDto {
	private String id;
	private String comment;
	private Boolean completed;
	private LocalDate date;

	public LessonEventDto() {
	}

	public LessonEventDto(String id, String comment, Boolean completed, LocalDate date) {
		this.id = id;
		this.comment = comment;
		this.completed = completed;
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

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}

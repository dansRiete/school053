package com.school053.journal.java.model.events;

import com.school053.journal.java.model.users.Child;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * This class is used to describe child mark entity.
 */
@Entity
@Table(name="child_marks")
@NamedQueries({
	@NamedQuery(name = ChildMark.GET_BY_CHILD_AND_SUBJECT, 
			query = "FROM ChildMark cm WHERE cm.child.id = :childId AND cm.lessonEvent.lesson.subject.id = :subjectId")
})
public class ChildMark implements Serializable {
    public static final String GET_BY_CHILD_AND_SUBJECT= "ChildMark.getByChildAndSubject";

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36)
    private String id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_event_id")
    private LessonEvent lessonEvent;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "child_id")
    private Child child;

    @ManyToOne(fetch = FetchType.EAGER)
    private LessonEventType lessonEventType;

    @Column(name = "mark")
    private Integer mark;

    @Column(name = "absent")
    private Boolean absent;

    @Column(name = "remark")
    private String remark;

    public ChildMark() {
    }

	public ChildMark(LessonEvent lessonEvent, Child child, LessonEventType lessonEventType, Integer mark,
			Boolean absent, String remark) {
		super();
		this.lessonEvent = lessonEvent;
		this.child = child;
		this.lessonEventType = lessonEventType;
		this.mark = mark;
		this.absent = absent;
		this.remark = remark;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LessonEvent getLessonEvent() {
		return lessonEvent;
	}

	public void setLessonEvent(LessonEvent lessonEvent) {
		this.lessonEvent = lessonEvent;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public LessonEventType getLessonEventType() {
		return lessonEventType;
	}

	public void setLessonEventType(LessonEventType lessonEventType) {
		this.lessonEventType = lessonEventType;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public Boolean getAbsent() {
		return absent;
	}

	public void setAbsent(Boolean absent) {
		this.absent = absent;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

package com.school053.journal.service;

import com.school053.journal.dto.SubjectDto;
import com.school053.journal.model.events.Subject;

import java.util.List;

public interface SubjectService {

    void createSubject(Subject subject);

    void deleteSubjectById(int id);

    SubjectDto getSubject(int id);

    List<SubjectDto> getSubjects();
}

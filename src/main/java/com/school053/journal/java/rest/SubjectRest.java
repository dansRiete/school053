package com.school053.journal.java.rest;

import com.school053.journal.java.dto.SubjectDto;
import com.school053.journal.java.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectRest {

    @Autowired
    private SubjectService subjectService;


    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<SubjectDto>> getSubjects() {
        List<SubjectDto> subjects = subjectService.getSubjects();
        return ResponseEntity.ok(subjects);
    }
}

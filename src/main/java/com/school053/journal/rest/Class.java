package com.school053.journal.rest;

import com.school053.journal.dto.ClassDto;
import com.school053.journal.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/class")
public class Class {

    @Autowired
    public ClassService classService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<ClassDto>> getClasses() {
        return ResponseEntity.ok(classService.getClasses());
    }
}

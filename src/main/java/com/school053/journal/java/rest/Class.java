package com.school053.journal.java.rest;

import com.school053.journal.java.dto.SchoolClassDto;
import com.school053.journal.java.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/class")
@CrossOrigin(origins = "http://localhost:4200")
public class Class {

    @Autowired
    public SchoolClassService classService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<SchoolClassDto>> getClasses() {
        return ResponseEntity.ok(classService.getClasses());
    }
}

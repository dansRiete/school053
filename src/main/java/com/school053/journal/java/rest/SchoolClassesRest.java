package com.school053.journal.java.rest;

import com.school053.journal.java.dto.SchoolClassDto;
import com.school053.journal.java.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school-class")
public class SchoolClassesRest {
    @Autowired
    private SchoolClassService schoolClassService;

    @GetMapping(value = "/fetchAll")
    public ResponseEntity<List<SchoolClassDto>> fetchAll() {
        return ResponseEntity.ok(schoolClassService.fetchAll());
    }

    @GetMapping(value = "/fetchActiveByName")
    public ResponseEntity<List<SchoolClassDto>> fetchAllActiveByName() {
        return ResponseEntity.ok(schoolClassService.fetchActiveByName());
    }

    @PostMapping(value = "/create")
    public String create(@RequestBody SchoolClassDto classDto) {
        schoolClassService.create(classDto);
        return "";
    }
}

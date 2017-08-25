package com.school053.journal.java.rest;

import com.school053.journal.java.dto.SchoolClassDto;
import com.school053.journal.java.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school-class")
public class SchoolClassesRest {
    @Autowired
    private SchoolClassService schoolClassService;

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<SchoolClassDto>> fetchAll() {
        return ResponseEntity.ok(schoolClassService.fetchAll());
    }

    @RequestMapping(value = "/fetchActiveByName", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<SchoolClassDto>> fetchAllActiveByName() {
        return ResponseEntity.ok(schoolClassService.fetchActiveByName());
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    public String create(@RequestBody SchoolClassDto classDto) {
        schoolClassService.create(classDto);
        return "";
    }
}

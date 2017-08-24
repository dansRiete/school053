package com.school053.journal.java.rest;

import com.school053.journal.java.dto.ClassAndChildDto;
import com.school053.journal.java.dto.SchoolClassDto;
import com.school053.journal.java.model.users.Child;
import com.school053.journal.java.model.users.SchoolClass;
import com.school053.journal.java.service.ChildService;
import com.school053.journal.java.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
@CrossOrigin(origins = "http://localhost:4200")
public class SchoolClasses {
    @Autowired
    private SchoolClassService classService;

    @Autowired
    private ChildService childService;

    /*@GetMapping("/getAllClasses")
    public ClassAndChildDto getAll() {
        List<SchoolClass> schoolClassList = classService.getAllActive();
        List<Child> children = childService.getAllActive();
        return new ClassAndChildDto(schoolClassList, children);
    }*/



    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<SchoolClassDto>> getClasses() {
        return ResponseEntity.ok(classService.getClasses());
    }

    @RequestMapping(value = "/getAllByName", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<SchoolClassDto>> getSchoolClassByName() {
        return ResponseEntity.ok(classService.findActiveByName());
    }

    @RequestMapping(value = "/addClass", method = RequestMethod.POST, produces = "application/json")
    public String addClass(@RequestBody SchoolClassDto classDto) {
        classService.add(classDto);
        return "";
    }
}

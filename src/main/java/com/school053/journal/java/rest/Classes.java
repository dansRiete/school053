package com.school053.journal.java.rest;

import com.school053.journal.java.dto.ChildDto;
import com.school053.journal.java.dto.ClassAndChildDto;
import com.school053.journal.java.dto.ClassDto;
import com.school053.journal.java.model.users.Child;
import com.school053.journal.java.model.users.SchoolClass;
import com.school053.journal.java.service.ChildService;
import com.school053.journal.java.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/classes")
@CrossOrigin(origins = "http://localhost:4200")
public class Classes {
    @Autowired
    private ClassService classService;

    @Autowired
    private ChildService childService;

    @GetMapping("/getAllClasses")
    public ClassAndChildDto getAll() {
        List<SchoolClass> schoolClassList = classService.getAllActive();
        List<Child> children = childService.getAllActive();
        return new ClassAndChildDto(schoolClassList, children);
    }



    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<ClassDto>> getClasses() {
        return ResponseEntity.ok(classService.getClasses());
    }



    @RequestMapping(value = "/addClass", method = RequestMethod.POST, produces = "application/json")
    public String addClass(@RequestBody ClassDto classDto) {
        System.out.println(classDto);
        classService.add(classDto);
        return "";
    }
}

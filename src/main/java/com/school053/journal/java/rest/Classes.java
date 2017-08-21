package com.school053.journal.java.rest;

import com.school053.journal.java.dto.ChildDto;
import com.school053.journal.java.dto.ClassAndChildDto;
import com.school053.journal.java.dto.ClassDto;
import com.school053.journal.java.model.users.Child;
import com.school053.journal.java.model.users.SchoolClass;
import com.school053.journal.java.service.ChildService;
import com.school053.journal.java.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class Classes {

    @Autowired
    private ClassService classService;

    @Autowired
    private ChildService childService;

    @GetMapping("/getAll")
    public ClassAndChildDto getAll() {
        List<SchoolClass> schoolClassList = classService.getAllActive();
        List<Child> children = childService.getAllActive();
        return new ClassAndChildDto(schoolClassList, children);
    }
}

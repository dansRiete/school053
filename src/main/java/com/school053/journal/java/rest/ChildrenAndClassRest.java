package com.school053.journal.java.rest;

import com.school053.journal.java.service.ChildService;
import com.school053.journal.java.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/children")
public class ChildrenAndClassRest {

    @Autowired
    private ChildService childService;

    @Autowired
    private SchoolClassService classService;



}

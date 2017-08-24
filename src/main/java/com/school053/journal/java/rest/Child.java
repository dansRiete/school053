package com.school053.journal.java.rest;

import com.school053.journal.java.dto.ChildDto;
import com.school053.journal.java.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/child")
@CrossOrigin(origins = "http://localhost:4200")
public class Child {

    @Autowired
    private ChildService childService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<ChildDto>> getChildren() {
        return ResponseEntity.ok(childService.getChildren());
    }

    @RequestMapping(value = "/getChildrenByClass", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<ChildDto>> getChildrenByClass() {
        return ResponseEntity.ok(childService.getChildren());
    }
}

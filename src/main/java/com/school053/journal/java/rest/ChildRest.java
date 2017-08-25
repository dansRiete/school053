package com.school053.journal.java.rest;

import com.school053.journal.java.dto.ChildDto;
import com.school053.journal.java.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/child")
@CrossOrigin(origins = "http://localhost:4200")//todo remove @CrossOrigin
public class ChildRest {

    private final ChildService childService;

    @Autowired
    public ChildRest(ChildService childService) {
        this.childService = childService;
    }

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<ChildDto>> fetchAll() {
        return ResponseEntity.ok(childService.fetchAll());
    }

    @CrossOrigin(origins = "http://localhost:4200")//todo remove @CrossOrigin
    @RequestMapping(value = "/fetchByParent", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<ChildDto>> fetchByParent(@RequestParam("parentId") String parentId) {
//        System.out.println("Parent id requested = " + parentId);
        return ResponseEntity.ok(childService.fetchByParent(parentId));
    }



}

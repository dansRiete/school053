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
public class ChildRest {

    private final ChildService childService;

    @Autowired
    public ChildRest(ChildService childService) {
        this.childService = childService;
    }

    @GetMapping(value = "/fetchAll")
    public ResponseEntity<List<ChildDto>> fetchAll() {
        return ResponseEntity.ok(childService.fetchAll());
    }

    @GetMapping(value = "/fetchByParent")
    public ResponseEntity<List<ChildDto>> fetchByParent(@RequestParam("parentId") String parentId) {
        return ResponseEntity.ok(childService.fetchByParent(parentId));
    }



}

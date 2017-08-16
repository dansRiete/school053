package com.school053.journal.rest;

import com.school053.journal.dto.ChildDto;
import com.school053.journal.model.users.Child;
import com.school053.journal.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/child")
public class ChildRest {

    @Autowired
    private ChildService childService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<ChildDto>> getChildren() {
        return ResponseEntity.ok(childService.getChildren());
    }
}
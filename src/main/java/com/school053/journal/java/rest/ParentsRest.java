package com.school053.journal.java.rest;

import com.school053.journal.java.dto.ParentDto;
import com.school053.journal.java.mapper.ParentMapper;
import com.school053.journal.java.service.ParentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/parent")
public class ParentsRest {

    //todo Logger isn't initialized properly
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ParentService parentService;

    @Autowired
    public ParentsRest(ParentService parentService) {
        this.parentService = parentService;
    }

    @GetMapping("/fetchAll")
    public List<ParentDto> fetchAll() {
        List<ParentDto> parentDtos = parentService.fetchAll().stream().map(ParentMapper.MAPPER::toDto).collect(Collectors.toList());
        return parentDtos;
    }

}

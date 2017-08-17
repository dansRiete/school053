package com.school053.journal.java.rest;

import com.school053.journal.java.model.users.Parent;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/parents")
public class Parents {


    @GetMapping("/getAll")
    public List<Parent> getAll() {
//        List<Parent> parents = parentService.getAllActive();
//        return new ParentsPageDto(parents);
        return null;
    }

}

package com.school053.journal.rest;

import com.school053.journal.model.users.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/parents")
public class ParentsRest {


    @GetMapping("/getAll")
    public List<Parent> getAll() {
//        List<Parent> parents = parentService.getAllActive();
//        return new ParentsPageDto(parents);
        return null;
    }

}

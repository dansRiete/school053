package com.school053.journal.rest;

import com.school053.journal.dao.impls.ChildDaoImpl;
import com.school053.journal.model.users.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Aleks on 15.08.2017.
 */
@RestController
@RequestMapping("/rest")
public class ChildMarksRest {

    private final ChildDaoImpl childDao;

    @Autowired
    public ChildMarksRest(ChildDaoImpl childDao) {
        this.childDao = childDao;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Child> getChildEvents() {
        System.out.println("REST CALLED");
        System.out.println("REST CALLED " + childDao.findAll().size());

        return childDao.findAll();
    }

}

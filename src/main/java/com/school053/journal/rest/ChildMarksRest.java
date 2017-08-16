package com.school053.journal.rest;

import com.school053.journal.dao.impls.ChildDaoImpl;
import com.school053.journal.model.users.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Aleks on 15.08.2017.
 */
@RestController
@RequestMapping("/child")
public class ChildMarksRest {

    private final ChildDaoImpl childDao;

    @Autowired
    public ChildMarksRest(ChildDaoImpl childDao) {
        this.childDao = childDao;
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<Child> getChildEvents() {
        System.out.println("REST CALLED");
        List<Child> fetchedChilds = childDao.getActiveChildren();
        System.out.println("REST CALLED " + fetchedChilds.size());
        System.out.println(fetchedChilds.get(0));
        return fetchedChilds;
    }

}

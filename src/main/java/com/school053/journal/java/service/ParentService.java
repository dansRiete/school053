package com.school053.journal.java.service;

import com.school053.journal.java.dto.ParentDto;
import com.school053.journal.java.model.users.Parent;

import java.util.List;

public interface ParentService {

    List<Parent> getAllActive();
}

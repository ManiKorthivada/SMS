package com.application.sms.controller;

import com.application.sms.model.Test;
import com.application.sms.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping
    public List<Test> getEmployees() {
        return this.testRepository.findAll();
    }
}

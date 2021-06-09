package com.ironman.wiki.controller;

import com.ironman.wiki.domain.Test;
import com.ironman.wiki.serivce.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;
    @Value("${test.hello:Test}")
    private String testHello;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World"+testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post," + name;
    }

    @GetMapping(value = "/test/list")
    public List<Test> list() {
        return testService.list();
    }
}

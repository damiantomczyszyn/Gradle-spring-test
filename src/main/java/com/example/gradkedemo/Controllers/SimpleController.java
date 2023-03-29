package com.example.gradkedemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import javax.swing.text.html.parser.Entity;

@RestController
public class SimpleController {

    @GetMapping(path="/hello")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello "+ name;
    }
}


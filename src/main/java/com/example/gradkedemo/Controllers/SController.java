package com.example.gradkedemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// Main class
public class SController {

    @RequestMapping("/hi")
    @ResponseBody
    public String helloGFG()
    {
        return "Hello GeeksForGeeks";
    }
}
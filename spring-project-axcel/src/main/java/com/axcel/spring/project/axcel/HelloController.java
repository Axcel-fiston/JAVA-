package com.axcel.spring.project.axcel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String hello(){
        return "what's good y'all that's my web application";
    }
    @GetMapping("/greeting")
    public String greeting(){
     return "greeting";
}
}

package com.sam.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}

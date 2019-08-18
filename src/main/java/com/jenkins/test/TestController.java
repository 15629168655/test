package com.jenkins.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/index")
    public ResponseEntity<String> index(){
        String as = "hello lwb";
        return new ResponseEntity<String>(as,HttpStatus.OK);
    }
}

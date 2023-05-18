package com.lesson.backend_docker_demo.controller;

import com.lesson.backend_docker_demo.utils.MessageResponse;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("hello")
    public ResponseEntity helloEndpoint(){
        return new ResponseEntity(new MessageResponse("Come state?"), HttpStatusCode.valueOf(200));
    }
}

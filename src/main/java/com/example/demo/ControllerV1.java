package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerV1 {

    @GetMapping("address")
    public String startv1() {
        return "This is V1";
    }
}

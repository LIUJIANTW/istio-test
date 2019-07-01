package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Calendar;
import java.util.TimeZone;


@RestController
public class TimeController {

    @GetMapping("/time")
    public String time(){
        return Calendar.getInstance(TimeZone.getDefault()).getTime().toString();

    }
}



package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerV1 {

    @GetMapping("/address")
    public String startv1() {
        return "This is V1";
    }

    @GetMapping("/gettime")
    public String getTime()
    {
        final String uri = "http://localhost:8080/time";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        return  "Current Time is " + result;
    }

}

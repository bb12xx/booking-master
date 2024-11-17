package com.example.booking_demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("booking/")
public class MyController {
    @GetMapping("getstring")
    public String getMyString()
    {
        return "Hello Bristi";
    }
}

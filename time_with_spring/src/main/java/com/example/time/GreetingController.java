package com.example.time;

import org.joda.time.LocalTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public class GreetingController {

    @GetMapping
    public String main(Map<String, Object> model) {
        LocalTime currentTime = LocalTime.now();
        model.put("some", currentTime);
        return "main";
    }

}
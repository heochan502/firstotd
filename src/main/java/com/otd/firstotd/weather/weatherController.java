package com.otd.firstotd.weather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/weather")
public class weatherController {

    @GetMapping


    public String weather() {
        return "weather";
    }
}

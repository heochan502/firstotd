package com.otd.firstotd.Meal;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/otd/meal")
@Slf4j
public class MealController {

    @GetMapping
    public String get() {
        log.info("meal");
        log.info("inha inha");
        return "meal";
    }
}

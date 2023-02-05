package com.peter.lee.controller;

import com.peter.lee.model.Score;
import com.peter.lee.model.Student;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author tangpengxiang
 * @Date 2023/1/10 22:29
 */
@RestController
@RequestMapping("/school")
@Log
public class EventController {

    @RequestMapping(value = "/{grade}", method = RequestMethod.POST)
    public String addStudent(@PathVariable String grade, @RequestParam String className, @RequestBody Student student) {
        log.info("Personal info: " + grade + "; " + className + "; " + student);
        return "Personal info: " + grade + "; " + className + "; " + student;
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String getStudent() {
        Student peter = Student
                .builder().name("Peter").age(29)
                .score(Score.builder().chinese(97).math(98).english(99).build())
                .build();
        log.info("Get student info: " + peter);
        return peter.toString();
    }
}

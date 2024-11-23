package com.microservice.course.controller;

import com.microservice.course.entities.Course;
import com.microservice.course.services.CourseService;
import com.microservice.course.services.CourseServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseServices;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public void saveStudent(@RequestBody Course course){
        courseServices.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllCourses(){
        return ResponseEntity.ok(courseServices.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long courseId){
        return ResponseEntity.ok(courseServices.findById(courseId));
    }

    @GetMapping("/search-student/{idCourse}")
    public ResponseEntity<?> findStudentsByIdCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(courseServices.findStudentByIdCourses(idCourse));
    }

}

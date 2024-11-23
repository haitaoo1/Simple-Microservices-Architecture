package com.microservice.course.services;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findById(Long courseId);
    void save(Course course);

    StudentByCourseResponse findStudentByIdCourses(Long idCourse);

}

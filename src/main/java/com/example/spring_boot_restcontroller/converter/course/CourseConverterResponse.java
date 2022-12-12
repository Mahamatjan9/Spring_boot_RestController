package com.example.spring_boot_restcontroller.converter.course;

import com.example.spring_boot_restcontroller.dto.response.CourseResponse;
import com.example.spring_boot_restcontroller.entity.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseConverterResponse {

    public CourseResponse create(Course course) {
        if (course == null) return null;
        CourseResponse courseResponse = new CourseResponse();
        courseResponse.setId(course.getId());
        courseResponse.setCourseName(course.getCourseName());
        courseResponse.setDuration(course.getDuration());
        courseResponse.setDescription(course.getDescription());
        return courseResponse;
    }

    public List<CourseResponse> getAll(List<Course> courses) {
        List<CourseResponse> courseResponses = new ArrayList<>();
        for (Course c : courses) {
            courseResponses.add(create(c));
        }
        return courseResponses;
    }
}

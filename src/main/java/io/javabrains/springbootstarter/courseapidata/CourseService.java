package io.javabrains.springbootstarter.courseapidata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;


    public List<Course> getAllCourses(String topicId ){
        List<Course> courseList = new ArrayList<>();
        courseRepository.findAllByTopicId(topicId)
                .forEach(courseList::add);
        return courseList;
    }

    public Course getCourse(String id){
        return courseRepository.findById(id).get();
    }

    public void addCourse( Course course){
        courseRepository.save(course);
    }

    public void updateCourse (Course course){
        courseRepository.save(course);
    }

    public void deleteCourse (String id){
        courseRepository.deleteById(id);
    }

}

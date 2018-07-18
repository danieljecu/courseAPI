package io.javabrains.springbootstarter.courseapidata;


import io.javabrains.springbootstarter.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId){
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @PostMapping( value= "/topics/{topicId}/courses/")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){

        //getAllCoursesTopics(t -> (course.getTopic().getId().equals(topicId))
        /*.equals()).findFirst().get();
                setTopic(new Topic(topicId,"",""));*/
        //course.setTopic(new Topic(topicRepository.getTopic(topicId)));

        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    @PutMapping( value= "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId , @PathVariable String id){

//        topicRepository.findById(topicId)
//        //daca exista topic-ul cu topicId
          //course.setTopic(new Topic(topicRepository.getTopic(topicId)));

        //update
        //if null not exist call post
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }

    @DeleteMapping( value= "/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id) { //@PathVariable("id")
        courseService.deleteCourse(id);
    }
}


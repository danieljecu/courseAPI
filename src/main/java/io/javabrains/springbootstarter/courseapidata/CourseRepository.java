package io.javabrains.springbootstarter.courseapidata;

import io.javabrains.springbootstarter.topic.Topic;
import org.springframework.data.repository.CrudRepository;

import java.awt.peer.CanvasPeer;
import java.util.List;


public interface CourseRepository extends CrudRepository<Course, String>{

    public List<Course> findAllByTopicId(String topicId);

    public List<Course> findByName(String name);
    public List<Course> findByDescription(String description);

    public List<Course> getCourseByTopicId(String topicId);
    public List<Course> findAllCourseByTopicId(String topicId);
}

package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

    //public List<Topic> findByIdTopic
    //getAllTopics()
    //getTopics(String id)
    //updateTopic(Topic t)
    //deleteTopic*String id)

}

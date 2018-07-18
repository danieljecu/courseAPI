package io.javabrains.springbootstarter.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public List<Topic> getAllTopics(){

        List<Topic> topicsList = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topicsList::add);
        return topicsList;
    }

    public Topic getTopic(String id){
        return topicRepository.findById(id).get();
    }

    public void addTopic( Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic (String id, Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic (String id){
        topicRepository.deleteById(id);
    }

}

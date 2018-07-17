package io.javabrains.springbootstarter.topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topicsList= new ArrayList<>( Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework description"),
            new Topic("java", "Core Java", "Core Java description"),
            new Topic("javascript", "Javascript", "JavaScript Description")
    ));

    public List<Topic> getAllTopics(){
        return topicsList;
    }

    public Topic getTopic(String id){
        return  topicsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic( Topic topic){
        topicsList.add(topic);
    }
    public void updateTopic (String id, Topic topic){
        for( int i = 0 ; i< topicsList.size(); i++){
            Topic t= topicsList.get(i);
            if (t.getId().equals(id)){
                topicsList.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic (String id){
        topicsList.removeIf(t -> t.getId().equals(id));
    }

}

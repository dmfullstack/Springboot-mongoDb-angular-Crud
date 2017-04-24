package bigdatapakcage.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service 
public class TopicService {

	@Autowired
	public TopicRespository topicRepositroy;
	List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("Springer","Spring-framework","This is first spring framework"),
			new Topic("Springter","Spring-framework","This is secondspring framework"),
			new Topic("Springting","Spring-framework","This is third spring framework")

			));
	public List<Topic> getAllTopic()
	{
		//return topics;
		List<Topic> topic=new ArrayList<>();
		topicRepositroy.findAll().forEach(topic:: add);
		return topic;
		
	}
	
	public Topic getTopic(String id){
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepositroy.findOne(id);
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepositroy.save(topic);
	}

	public void updateTopic(String id,Topic topic) {
		topicRepositroy.save(topic);
	}

	

	public void deleteTopic(String id) {
		topicRepositroy.delete(id);
	}
}


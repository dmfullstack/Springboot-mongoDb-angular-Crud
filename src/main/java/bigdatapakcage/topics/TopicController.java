package bigdatapakcage.topics;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	public TopicService topicservice;
	
	@RequestMapping("/topic")
	public List<Topic> geAll()
	{
		return  topicservice.getAllTopic();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id){
		
		return  topicservice.getTopic(id);

	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topic")
	public void addTopic(@RequestBody Topic topic){
		topicservice.addTopic(topic);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/topic/{id}")
	public void updatedTopic(@RequestBody Topic topic,@PathVariable String id){
		topicservice.updateTopic(id, topic);
		
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/topic/{id}")
	public void deleteTopic(@PathVariable String id){
		topicservice.deleteTopic(id);

	}
}

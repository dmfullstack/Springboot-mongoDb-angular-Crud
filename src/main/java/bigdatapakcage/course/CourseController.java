package bigdatapakcage.course;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bigdatapakcage.topics.Topic;

@RestController
public class CourseController {
	
	@Autowired
	public CourseService courseservice;
	
	@RequestMapping("/topic/{id}/course")
	public List<Course> geAll(@PathVariable String id)
	{
		return courseservice.getAllCourse(id);
	}
	
	@RequestMapping("/topic/{topicId}/course/{id}")
	public Course getTopic(@PathVariable String id){
		
		return  courseservice.getCourse(id);

	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topic/{topicId}/course")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId){
		course.setTopic(new Topic(topicId,"",""));
		courseservice.addCourse(course);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/topic/{topicId}/course/{id}")
	public void updatedCourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id){
		course.setTopic(new Topic(topicId,"",""));
		courseservice.updateCourse(course);
		
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/topic/{topicId}/course/{id}")
	public void deleteCourse(@PathVariable String id){
		courseservice.deleteCourse(id);

	}
}

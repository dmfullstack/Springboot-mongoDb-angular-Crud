package bigdatapakcage.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service 
public class CourseService {

	@Autowired
	public CourseRespository courseRepositroy;
	
	public List<Course> getAllCourse(String topicId)
	{
		//return topics;
		List<Course> course=new ArrayList<>();
		courseRepositroy.findByTopicId(topicId).forEach(course:: add); 
		return course;
		
	}
	
	public Course getCourse(String id){
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return courseRepositroy.findOne(id);
	}

	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepositroy.save(course);
	}

	public void updateCourse(Course course) {
		courseRepositroy.save(course);
	}

	

	public void deleteCourse(String id) {
		courseRepositroy.delete(id);
	}
}


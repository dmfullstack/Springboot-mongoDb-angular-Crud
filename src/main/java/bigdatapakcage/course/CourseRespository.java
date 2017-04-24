package bigdatapakcage.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRespository extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String Id);

}

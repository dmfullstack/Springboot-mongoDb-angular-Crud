package bigdatapakcage.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import bigdatapakcage.topics.Topic;


@Entity
public class Course {
	
	@Id
	public String id;
	public String Name;
	public String description;
	
	@ManyToOne
	private Topic topic;
	//Constructor for above defined Strings !!!
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Course ()
	{
		
	}
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		Name = name;
		this.description = description;
		this.topic=new Topic(topicId,"","");
	}
	
	// Setter and Getter for above defined Strings !!!
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}

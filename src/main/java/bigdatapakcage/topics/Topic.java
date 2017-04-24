package bigdatapakcage.topics;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Topic {
	
	@Id
	public String id;
	public String Name;
	public String description;
	 
	//Constructor for above defined Strings !!!
	
	public Topic ()
	{
		
	}
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		Name = name;
		this.description = description;
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

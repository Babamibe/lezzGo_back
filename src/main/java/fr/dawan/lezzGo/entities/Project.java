package fr.dawan.lezzGo.entities;

import java.io.Serializable;
import java.util.List;

@Entity
public class Project implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long id;
	
	private Destination destination;
	
	private List<Activity> activities;

	public Project() {
	}

}

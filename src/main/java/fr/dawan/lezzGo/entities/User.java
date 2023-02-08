package fr.dawan.lezzGo.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id()
	private long id;
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	
	private List<UserProject> userProject;
	
	private List<User> friends;
	

	public User() {
		
	}

}

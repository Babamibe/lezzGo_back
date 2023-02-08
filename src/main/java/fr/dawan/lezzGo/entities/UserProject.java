package fr.dawan.lezzGo.entities;

import java.time.LocalDate;
import java.util.List;

import javax.print.attribute.standard.Destination;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class UserProject {
	
	@EmbeddedId
	private UserProjectPrimaryKey userProject_pk;
	
	@Enumerated(EnumType.STRING)
	private RoleEnum role;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Project project;
	
	private LocalDate start;
	private LocalDate finish;
	
	private int budget;
	
	@ManyToOne
	private Destination destination;
	
	@ManyToMany
	private List<Activity> activities;

}

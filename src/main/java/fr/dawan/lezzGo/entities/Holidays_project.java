package fr.dawan.lezzGo.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import fr.dawan.lezzGo.enums.Destination;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



//TABLE HOLIDAYS


@Entity
@Table(name="holidays")
public class Holidays_project implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long holidays_id;
	
	private Destination destination;
	private LocalDate deadline;
	
	@OneToMany(mappedBy="participate")
	private List<Participate> participate;
	
	
	

	//constructeur simple
	public Holidays_project() {
		
		
	}


	public Holidays_project(long holidays_id, Destination destination, LocalDate deadline) {
		super();
		this.holidays_id = holidays_id;
		this.destination = destination;
		this.deadline = deadline;
	}


	public long getHolidays_id() {
		return holidays_id;
	}


	public void setHolidays_id(long holidays_id) {
		this.holidays_id = holidays_id;
	}


	public Destination getDestination() {
		return destination;
	}


	public void setDestination(Destination destination) {
		this.destination = destination;
	}


	public LocalDate getDeadline() {
		return deadline;
	}


	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}


	
	@Override
	public String toString() {
		return "Holidays_project [holidays_id=" + holidays_id + ", destination=" + destination + ", deadline="
				+ deadline + "]";
	}
	
	
	
	
	

}

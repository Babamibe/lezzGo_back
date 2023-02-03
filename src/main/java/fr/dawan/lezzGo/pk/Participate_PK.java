package fr.dawan.lezzGo.pk;

import java.io.Serializable;

import jakarta.persistence.Embeddable;


//PRIMARY KEY DE LA TABLE PARTICIPATE


@Embeddable
public class Participate_PK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
		
	private Long user_id;
	private Long holidays_id;
	
	public Participate_PK() {
		
	}

	public Participate_PK(Long user_id, Long holidays_id) {
		this.user_id = user_id;
		this.holidays_id = holidays_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getHolidays_id() {
		return holidays_id;
	}

	public void setHolidays_id(Long holidays_id) {
		this.holidays_id = holidays_id;
	}
	
	
	
	
	
	

}

package fr.dawan.lezzGo.entities;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


//TABLE USER


@Entity
@Table(name = "user" )
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//paramètres users
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	
	@Column(length = 50,nullable = false)
	private String firstName; //perso
	
	@Column(length = 50,nullable = false)
	private String lastName; //perso
	
	@JsonProperty(value = "name")
	@Column(length = 50,nullable = false)
	private String username; //public
	
	@Column(length = 225,nullable = false)
	private String email_address;
	
	@Column(length = 30,nullable = false)
	private String password;
	
	private Blob profile_picture;
	
	@OneToMany(mappedBy="participate")
	private List<Participate> participate;
	
	private List<Date> dateList;
	
		
	//constructeur simple
	public User() {
			
	}

	//constructeur avec paramètres
	public User(long user_id, String firstName, String lastName, String username, String email_address, String password,
			Blob profile_picture) {
		super();
		this.user_id = user_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email_address = email_address;
		this.password = password;
		this.profile_picture = profile_picture;
	}
	
	public List<Date> getUser_date() {
		return dateList;
	}
	
	public void setUser_date (List<Date> lst) {
		this.dateList = lst;
	}
	
	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Blob getProfile_picture() {
		return profile_picture;
	}

	public void setProfile_picture(Blob profile_picture) {
		this.profile_picture = profile_picture;
	}

	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", email_address=" + email_address + ", password=" + password + ", profile_picture="
				+ profile_picture + "]";
	}
	
	
	
	
	

	

}

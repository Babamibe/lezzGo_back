package fr.dawan.lezzGo.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


//TABLE USER


@Entity
@Table(name = "users" )
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "avatar_id")
	private Avatar avatar;
	
	@Column(nullable = true, name = "first_name")
	private String firstName;
	
	@Column(nullable = true, name = "last_name")
	private String lastName;
	
	@Column(nullable = false, name = "username", updatable = false)
	private String userName;
	
	@Column(nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<UserProject> participate;
	
	@ManyToMany
	private List<User> friends;

    public User() {
    }
    
    

    public User(long id, Avatar avatar, String firstName, String lastName, String userName, String password,
            List<UserProject> participate, List<User> friends) {
        this.id = id;
        this.avatar = avatar;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.participate = participate;
        this.friends = friends;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserProject> getParticipate() {
        return participate;
    }

    public void setParticipate(List<UserProject> participate) {
        this.participate = participate;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }



    @Override
    public String toString() {
        return "User [id=" + id + ", avatar=" + avatar + ", firstName=" + firstName + ", lastName=" + lastName
                + ", userName=" + userName + ", password=" + password + ", participate=" + participate + ", friends="
                + friends + "]";
    }
	
	
	
	
	
	
	
	
	
	

	

}

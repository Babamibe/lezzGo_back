package fr.dawan.lezzGo.dto;

import java.sql.Blob;
import java.util.List;


public class UserDto {

    private long user_id;
    

    private String firstName;
    

    private String lastName;
    

    private String username;
    

    private String email_address;
    

    private String password;
    
    private Blob profile_picture;
    

    private List<ParticipateDto> participate;
    
        
    //constructeur simple
    public UserDto() {
            
    }

    //constructeur avec paramètres
    public UserDto(long user_id, String firstName, String lastName, String username, String email_address, String password,
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
        return "UserDto [user_id=" + user_id + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
                + username + ", email_address=" + email_address + ", password=" + password + ", profile_picture="
                + profile_picture + "]";
    }
    

}

package fr.dawan.lezzGo.dto;

import java.time.LocalDate;
import java.util.List;

import fr.dawan.lezzGo.entities.Holidays_project;
import fr.dawan.lezzGo.pk.Participate_PK;


public class ParticipateDto {
    

    private Participate_PK primary_key;
    

    private UserDto user;

    private Holidays_project project;
    
    private int budget_by_user;
    private List<LocalDate> availability_list; //où vont les dispos individuelles ?
    
    //liste des photos de profil à choisir
    private byte[] profile_picture;
    

    public ParticipateDto() {
        
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public Holidays_project getProject() {
        return project;
    }

    public void setProject(Holidays_project project) {
        this.project = project;
    }

    public int getBudget_by_user() {
        return budget_by_user;
    }

    public void setBudget_by_user(int budget_by_user) {
        this.budget_by_user = budget_by_user;
    }

    public List<LocalDate> getAvailability_list() {
        return availability_list;
    }

    public void setAvailability_list(List<LocalDate> availability_list) {
        this.availability_list = availability_list;
    }

    public Participate_PK getPrimary_key() {
        return primary_key;
    }

    public void setPrimary_key(Participate_PK primary_key) {
        this.primary_key = primary_key;
    }

    public byte[] getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(byte[] profile_picture) {
        this.profile_picture = profile_picture;
    }

    

}

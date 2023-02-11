package fr.dawan.lezzGo.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects")
public class Project implements Serializable {


    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private long id;
    
    private boolean isOpen;
    
    @ManyToOne
    @Column
    private Destination destination;
    
    @ManyToOne
    private List<Activity> activites;

    public Project() {
    }

    public Project(long id, boolean isOpen, Destination destination, List<Activity> activites) {
        this.id = id;
        this.isOpen = isOpen;
        this.destination = destination;
        this.activites = activites;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public List<Activity> getActivites() {
        return activites;
    }

    public void setActivites(List<Activity> activites) {
        this.activites = activites;
    }

    @Override
    public String toString() {
        return "Project [id=" + id + ", isOpen=" + isOpen + ", destination=" + destination + ", activites=" + activites
                + "]";
    }
    
    


    
    

}

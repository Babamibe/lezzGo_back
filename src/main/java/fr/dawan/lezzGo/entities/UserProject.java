package fr.dawan.lezzGo.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import fr.dawan.lezzGo.enums.RoleEnum;
import fr.dawan.lezzGo.pk.UserProjectId;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_project")
public class UserProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @Column(name = "user_project_id")
    private UserProjectId userProjectId;
    
    @Enumerated(EnumType.STRING)
    private RoleEnum roleEnum;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Project project;
    
    private LocalDate debut;
    
    private LocalDate fin;
    
    private int budget;
    
    @ManyToMany
    private List<Activity> activites;

    public UserProject() {
    }

    public UserProject(UserProjectId userProjectId, RoleEnum roleEnum, User user, Project project, LocalDate debut,
            LocalDate fin, int budget, List<Activity> activites) {
        this.userProjectId = userProjectId;
        this.roleEnum = roleEnum;
        this.user = user;
        this.project = project;
        this.debut = debut;
        this.fin = fin;
        this.budget = budget;
        this.activites = activites;
    }

    public UserProjectId getUserProjectId() {
        return userProjectId;
    }

    public void setUserProjectId(UserProjectId userProjectId) {
        this.userProjectId = userProjectId;
    }

    public RoleEnum getRoleEnum() {
        return roleEnum;
    }

    public void setRoleEnum(RoleEnum roleEnum) {
        this.roleEnum = roleEnum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public LocalDate getDebut() {
        return debut;
    }

    public void setDebut(LocalDate debut) {
        this.debut = debut;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public List<Activity> getActivites() {
        return activites;
    }

    public void setActivites(List<Activity> activites) {
        this.activites = activites;
    }

    @Override
    public String toString() {
        return "UserProject [userProjectId=" + userProjectId + ", roleEnum=" + roleEnum + ", user=" + user
                + ", project=" + project + ", debut=" + debut + ", fin=" + fin + ", budget=" + budget + ", activites="
                + activites + "]";
    }
    
    
    
    
}

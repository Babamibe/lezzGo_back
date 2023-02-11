package fr.dawan.lezzGo.pk;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;


//PRIMARY KEY DE LA TABLE PARTICIPATE


@Embeddable
public class UserProjectId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
		
	private Long user_id;
	
	private Long project_id;

    public UserProjectId() {
    }

    public UserProjectId(Long user_id, Long project_id) {
        this.user_id = user_id;
        this.project_id = project_id;
    }

    public Long getUser_id() {
        return user_id;
    }


    public Long getProject_id() {
        return project_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(project_id, user_id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserProjectId other = (UserProjectId) obj;
        return Objects.equals(project_id, other.project_id) && Objects.equals(user_id, other.user_id);
    }

    
    

	
	
	

	
	
	
	
	

}

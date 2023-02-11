package fr.dawan.lezzGo.entities;

import java.io.Serializable;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity(name = "avatars")
public class Avatar implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avatar_id")
    private long id;
    
    @Lob
    private byte [] avatar;
    
    public Avatar() {
    }
    
    public Avatar(long id, byte[] avatar) {
        this.id = id;
        this.avatar = avatar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Avatar [id=" + id + ", avatar=" + Arrays.toString(avatar) + "]";
    }
    
    
    
    
    

}

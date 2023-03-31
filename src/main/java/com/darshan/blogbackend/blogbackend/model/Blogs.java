package com.darshan.blogbackend.blogbackend.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//import java.util.Date;
//
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Blogs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "blogs_gen")
    @SequenceGenerator(name = "blogs_gen", sequenceName = "blogs_gen", allocationSize = 1)
    
    private int id;
    @Column
    @NonNull
    private String title;

	@Column
    @NonNull
    private String image;
    
    @Column
    @NonNull
    private String description;
    
    @ManyToOne
    private User user;
    
    @OneToOne
    private Location location;
    
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;
    
    
   

	@Override
    public String toString() {
        return this.id + " " + this.title + " " + this.image + " " + this.description;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public String getImage(){
        return this.image;
    }

    public void setImage(String image){
        this.image=image;
    }
    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public User getUser() {
        return user;
     }
  
     public void setUser(User user) {
        this.user = user;
     }
     public Date getCreated_at() {
 		return created_at;
 	}

 	public Date getUpdated_at() {
 		return updated_at;
 	}

    
    public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
    
}

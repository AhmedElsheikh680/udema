package com.seniorsteps.model;
// Generated Nov 21, 2020 2:55:45 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name="course"
    ,catalog="online_courses"
)
public class Course  implements java.io.Serializable {


     private Integer id;
     private Instructor instructor;
     private Lookup lookup;
     private String description;
     private String image;
     private String title;
     private Set<Enrollment> enrollments = new HashSet<Enrollment>(0);
     private Set<Content> contents = new HashSet<Content>(0);
     private Set<Review> reviews = new HashSet<Review>(0);

    public Course() {
    }

    public Course(Instructor instructor, Lookup lookup, String description, String image, String title, Set<Enrollment> enrollments, Set<Content> contents, Set<Review> reviews) {
       this.instructor = instructor;
       this.lookup = lookup;
       this.description = description;
       this.image = image;
       this.title = title;
       this.enrollments = enrollments;
       this.contents = contents;
       this.reviews = reviews;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="INSTRUCTOR_ID")
    public Instructor getInstructor() {
        return this.instructor;
    }
    
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CATEGORY_ID")
    public Lookup getLookup() {
        return this.lookup;
    }
    
    public void setLookup(Lookup lookup) {
        this.lookup = lookup;
    }

    
    @Column(name="DESCRIPTION")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="IMAGE")
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    
    @Column(name="TITLE")
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Enrollment> getEnrollments() {
        return this.enrollments;
    }
    
    public void setEnrollments(Set<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Content> getContents() {
        return this.contents;
    }
    
    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Review> getReviews() {
        return this.reviews;
    }
    
    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }




}



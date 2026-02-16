package com.lms.real_estate_crm.entity;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String userStatus;
    private String userName;
    private String email;
    private String contact;
    private String department;
    private String position;

    @ElementCollection
    private List<String> projectAssigned;

    @ElementCollection
    private List<String> telecallerAssigned;

    @ElementCollection
    private List<String> permissions;

    // ---------- Getters & Setters ----------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }
 
    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }
 
    public void setPosition(String position) {
        this.position = position;
    }

    public List<String> getProjectAssigned() {
        return projectAssigned;
    }

    public void setProjectAssigned(List<String> projectAssigned) {
        this.projectAssigned = projectAssigned;
    }

    public List<String> getTelecallerAssigned() {
        return telecallerAssigned;
    }

    public void setTelecallerAssigned(List<String> telecallerAssigned) {
        this.telecallerAssigned = telecallerAssigned;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}

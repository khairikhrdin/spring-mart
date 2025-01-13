package com.example.ccsd.Users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Base64;

@Document(collection = "user")
public class users {

    @Id
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String role;
    private String username;
    private String dob;
    private byte[] profPic;

    // Transient field for Base64-encoded image
    @JsonInclude(JsonInclude.Include.NON_NULL) // Include only if non-null
    private transient String imageStore64String;

    // Getters and Setters for all fields
    public String getImageStore64String() {
        return profPic != null ? Base64.getEncoder().encodeToString(profPic) : null;
    }

    public void setImageStore64String(String imageStore64String) {
        this.imageStore64String = imageStore64String;
    }
    
    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public byte[] getProfPic() {
        return profPic;
    }

    public void setProfPic(byte[] profPic) {
        this.profPic = profPic;
    }

    // Method to get Base64-encoded image as String
    public String getImageAsBase64() {
        return profPic != null ? Base64.getEncoder().encodeToString(profPic) : null;
    }
}

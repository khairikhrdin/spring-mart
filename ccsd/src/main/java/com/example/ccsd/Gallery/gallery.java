package com.example.ccsd.Gallery;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Base64;


@Document(collection = "Gallery")
public class gallery {

    private String id;
    private String title;
    private String postSlug;
    private String postShortDescription;
    private String tag;
    private String place;
    private String date;
    private String status;
    private String content;
    private byte[] image;

    public gallery() {
    }

    public gallery(String title, String postSlug, String postShortDescription, String tag, String place, String date, String status, String content) {
        this.title = title;
        this.postSlug = postSlug;
        this.postShortDescription = postShortDescription;
        this.tag = tag;
        this.place = place;
        this.date = date;
        this.status = status;
        this.content = content;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostSlug() {
        return postSlug;
    }

    public void setPostSlug(String postSlug) {
        this.postSlug = postSlug;
    }

    public String getPostShortDescription() {
        return postShortDescription;
    }

    public void setpostShortDescription(String postShortDescription) {
        this.postShortDescription = postShortDescription;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public byte[] getImage() {
        return image;
    }

    public void setimage(byte[] image) {
        this.image = image;
    }

    public String getImageAsBase64() {
        return Base64.getEncoder().encodeToString(image);
    }

    public void setImage64String(String base64String) {
        this.image = Base64.getDecoder().decode(base64String);
    }
}


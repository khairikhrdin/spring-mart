package com.example.ccsd.Products;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Base64;

@Document(collection = "products")
public class products {

    @Id
    private String id;
    private String title;
    private String postSlug;
    private String postShortDescription;
    private String tag;
    private String place;
    private String dateProduct;
    private String status;
    private byte[] imageStore;

    @Transient // Ensures this field is not stored in MongoDB
    private String imageStore64String;

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

    public void setPostShortDescription(String postShortDescription) {
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

    public String getDateProduct() {
        return dateProduct;
    }

    public void setDateProduct(String dateProduct) {
        this.dateProduct = dateProduct;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getImageStore() {
        return imageStore;
    }

    public void setImageStore(byte[] imageStore) {
        this.imageStore = imageStore;
    }

    public String getImageAsBase64() {
        // Converts the image byte array to Base64 string
        return imageStore != null ? Base64.getEncoder().encodeToString(imageStore) : null;
    }

    public void setImageStore64String(String imageStore64String) {
        // Optional: Allows manual setting of Base64 string if required
        this.imageStore64String = imageStore64String;
    }
}

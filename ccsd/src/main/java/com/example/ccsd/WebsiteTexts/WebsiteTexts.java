package com.example.ccsd.WebsiteTexts;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "websitetexts")
public class WebsiteTexts {

    @Id
    private String id;
    private String title;
    private String content;

    // Constructors
    public WebsiteTexts() {
    }

    public WebsiteTexts(String id, String title, String content) {
        this.id = id;
        this.title = title;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

package com.example.ccsd.WebsiteImages;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WebsiteImagesService {
    

    @Autowired
    private WebsiteImagesRepository websiteImagesRepository;

    // Fetch all WebsiteImages
    public List<WebsiteImages> getAllWebsiteImageses() {
        return websiteImagesRepository.findAll();
    }

    // Fetch a specific WebsiteImage by ID
    public Optional<WebsiteImages> getWebsiteImagesById(String id) {
        return websiteImagesRepository.findById(id);
    }

    // Add a new WebsiteImage
    public WebsiteImages addWebsiteImages(WebsiteImages websiteImages) {
        return websiteImagesRepository.save(websiteImages);
    }

    // Update an existing WebsiteImage
    public WebsiteImages updateWebsiteImages(String id, WebsiteImages updatedWebsiteImages) {
        return websiteImagesRepository.findById(id).map(websiteImages -> {
            websiteImages.setTitle(updatedWebsiteImages.getTitle());
            websiteImages.setPostShortDescription(updatedWebsiteImages.getPostShortDescription());
            websiteImages.setDate(updatedWebsiteImages.getDate());
            websiteImages.setStatus(updatedWebsiteImages.getStatus());
            websiteImages.setTag(updatedWebsiteImages.getTag());
            websiteImages.setPlace(updatedWebsiteImages.getPlace());
            websiteImages.setContent(updatedWebsiteImages.getContent());
            websiteImages.setPostSlug(updatedWebsiteImages.getPostSlug());
            websiteImages.setImage(updatedWebsiteImages.getImage());
            return websiteImagesRepository.save(websiteImages);
        }).orElse(null);
    }

    // Delete a WebsiteImage by ID
    public void deleteWebsiteImages(String id) {
        websiteImagesRepository.deleteById(id);
    }



    
}
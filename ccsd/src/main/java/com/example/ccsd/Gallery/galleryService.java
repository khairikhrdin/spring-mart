package com.example.ccsd.Gallery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class galleryService {


    @Autowired
    private galleryRepository galleryRepository;

    // Retrieve all galleries
    public List<gallery> getAllGallerys() {
        return galleryRepository.findAll();
    }

    // Add a new gallery
    public gallery addGallery(gallery newGallery) {
        return galleryRepository.save(newGallery);
    }

    // Retrieve a gallery by ID
    public Optional<gallery> getGalleryById(String id) {
        return galleryRepository.findById(id);
    }

    // Update an existing gallery
    public gallery updategallery(String id, gallery galleryDetails) {
        return galleryRepository.findById(id).map(existingGallery -> {
            existingGallery.setTitle(galleryDetails.getTitle());
            existingGallery.setPostSlug(galleryDetails.getPostSlug());
            existingGallery.setpostShortDescription(galleryDetails.getPostShortDescription());
            existingGallery.setTag(galleryDetails.getTag());
            existingGallery.setPlace(galleryDetails.getPlace());
            existingGallery.setDate(galleryDetails.getDate());
            existingGallery.setStatus(galleryDetails.getStatus());
            existingGallery.setContent(galleryDetails.getContent());
            existingGallery.setimage(galleryDetails.getImage());
            return galleryRepository.save(existingGallery);
        }).orElse(null);
    }

    // Delete a gallery by ID
    public void deletegallery(String id) {
        galleryRepository.deleteById(id);
    }
}
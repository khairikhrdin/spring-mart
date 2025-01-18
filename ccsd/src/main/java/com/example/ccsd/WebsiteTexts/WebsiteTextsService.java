package com.example.ccsd.WebsiteTexts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WebsiteTextsService {

    @Autowired
    private WebsiteTextsRepository websiteTextsRepository;

    public List<WebsiteTexts> getAllText() {
        return websiteTextsRepository.findAll();
    }

    public Optional<WebsiteTexts> getTextById(String id) {
        return websiteTextsRepository.findById(id);
    }

    public WebsiteTexts addText(WebsiteTexts websiteTexts) {
        return websiteTextsRepository.save(websiteTexts);
    }

    public WebsiteTexts updateText(String id, WebsiteTexts textDetails) {
        return websiteTextsRepository.findById(id).map(existingText -> {
            existingText.setTitle(textDetails.getTitle());
            existingText.setContent(textDetails.getContent());
            return websiteTextsRepository.save(existingText);
        }).orElse(null);
    }

    public void deleteText(String id) {
        websiteTextsRepository.deleteById(id);
    }
}

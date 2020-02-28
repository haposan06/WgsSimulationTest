package com.example.accessingdatamysql.service.implementation;

import com.example.accessingdatamysql.model.Content;
import com.example.accessingdatamysql.repository.ContentRepository;
import com.example.accessingdatamysql.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContentServiceImplementation implements ContentService {

    @Autowired
    private ContentRepository contentRepository;

    @Override
    public Content createContent(Content content) {
        return contentRepository.saveAndFlush(content);
    }

    @Override
    public List<Content> listContent(String description) {
        return contentRepository.findByDescriptionLike(description);
    }
}

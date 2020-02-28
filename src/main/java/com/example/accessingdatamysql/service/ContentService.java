package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.model.Content;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContentService {
    public Long createContent(Content content);
    public List<Content> listContent(String keyword);
}

package com.example.accessingdatamysql.controller;

import com.example.accessingdatamysql.model.Content;
import com.example.accessingdatamysql.model.User;
import com.example.accessingdatamysql.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @GetMapping
    public @ResponseBody List<Content> getContents(@RequestParam("search") String description) {
        return contentService.listContent(description);
    }
}

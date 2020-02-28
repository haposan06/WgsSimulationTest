package com.example.accessingdatamysql.repository;

import com.example.accessingdatamysql.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Long> {
    public List<Content> findByDescriptionLike(String description);
}

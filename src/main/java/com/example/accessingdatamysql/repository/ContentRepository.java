package com.example.accessingdatamysql.repository;

import com.example.accessingdatamysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContentRepository extends JpaRepository<User, Long> {
    public User findByDescriptionLike(String description);
}

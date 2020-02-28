package com.example.accessingdatamysql.repository;

import com.example.accessingdatamysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<User, Long> {
}

package com.example.accessingdatamysql.repository;

import com.example.accessingdatamysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("Select u from user u where (email = :email or username = :email) and password = :password")
    public User findByEmailOrUsernameAndPassword(@Param("email") String email, @Param("password") String password);
}

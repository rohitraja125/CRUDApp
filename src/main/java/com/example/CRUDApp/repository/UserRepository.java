package com.example.CRUDApp.repository;

import com.example.CRUDApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

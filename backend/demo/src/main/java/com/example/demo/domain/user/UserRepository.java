package com.example.demo.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

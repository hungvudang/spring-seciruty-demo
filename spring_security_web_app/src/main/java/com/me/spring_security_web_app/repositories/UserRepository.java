package com.me.spring_security_web_app.repositories;

import java.util.Optional;

import com.me.spring_security_web_app.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}

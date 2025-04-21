package com.LoginLogoutAPI.userauthapi.repository;

import com.LoginLogoutAPI.userauthapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}


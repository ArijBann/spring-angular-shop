package com.example.shop.repository;

import com.example.shop.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByusername(String username);
    Boolean existsByusername(String username);
}

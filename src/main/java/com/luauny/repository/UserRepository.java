package com.luauny.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luauny.model.User;

public interface UserRepository extends JpaRepository <User, Integer > {
}

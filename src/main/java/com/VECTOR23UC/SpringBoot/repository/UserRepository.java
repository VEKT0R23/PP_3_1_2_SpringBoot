package com.VECTOR23UC.SpringBoot.repository;

import com.VECTOR23UC.SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

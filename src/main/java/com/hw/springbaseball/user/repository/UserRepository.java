package com.hw.springbaseball.user.repository;

import com.hw.springbaseball.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

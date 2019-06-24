package com.technoir.repcen.repository;

import com.technoir.repcen.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

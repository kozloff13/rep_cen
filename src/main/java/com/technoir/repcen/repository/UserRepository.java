package com.technoir.repcen.repository;

import com.technoir.repcen.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

}

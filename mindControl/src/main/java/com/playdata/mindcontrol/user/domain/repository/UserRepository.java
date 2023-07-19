package com.playdata.mindcontrol.user.domain.repository;

import com.playdata.mindcontrol.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

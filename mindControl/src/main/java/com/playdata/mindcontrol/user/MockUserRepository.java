package com.playdata.mindcontrol.user;

import com.playdata.mindcontrol.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MockUserRepository extends JpaRepository<User,Long> {

}

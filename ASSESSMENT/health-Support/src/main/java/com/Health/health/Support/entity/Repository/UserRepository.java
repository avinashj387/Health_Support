package com.Health.health.Support.entity.Repository;

import com.Health.health.Support.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

	User findByEmailId(String emailId);
}

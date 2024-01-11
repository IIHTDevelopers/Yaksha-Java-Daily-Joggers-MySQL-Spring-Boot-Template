package com.dailyjoggers.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailyjoggers.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	// write your logic here
}

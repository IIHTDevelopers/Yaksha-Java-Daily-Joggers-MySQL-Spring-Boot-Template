package com.dailyjoggers.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailyjoggers.entity.DailyActivity;

public interface DailyActivityRepository extends JpaRepository<DailyActivity, Long> {
	// write your logic here
}

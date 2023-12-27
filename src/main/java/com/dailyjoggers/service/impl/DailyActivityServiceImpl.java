package com.dailyjoggers.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dailyjoggers.dto.DailyActivityDTO;
import com.dailyjoggers.service.DailyActivityService;

@Service
public class DailyActivityServiceImpl implements DailyActivityService {

	@Override
	public DailyActivityDTO createDailyActivity(Long userId, DailyActivityDTO dailyActivityDTO) {
		// write your logic here
		return null;
	}

	@Override
	public Page<DailyActivityDTO> getDailyActivityForUser(Long userId, Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public DailyActivityDTO updateDailyActivityForUser(Long userId, Long activityId,
			DailyActivityDTO dailyActivityDTO) {
		// write your logic here
		return null;
	}

	@Override
	public void deleteDailyActivityForUser(Long userId, Long activityId) {
		// write your logic here
	}

	@Override
	public DailyActivityDTO getSummarizedDailyActivityForUserByDate(Long userId, LocalDate date) {
		// write your logic here
		return null;
	}

	@Override
	public List<DailyActivityDTO> getSummarizedWeeklyActivityForUser(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public List<DailyActivityDTO> getSummarizedMonthlyActivityForUser(Long userId) {
		// write your logic here
		return null;
	}

	public static DailyActivityDTO[] mapObjectArrayToDTOArray(List<Object[]> objectArray) {
		// write your logic here
		return null;
	}
}

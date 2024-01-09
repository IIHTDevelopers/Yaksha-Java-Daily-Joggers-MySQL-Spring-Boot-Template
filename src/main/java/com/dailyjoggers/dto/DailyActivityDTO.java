package com.dailyjoggers.dto;

import java.time.LocalDate;

public class DailyActivityDTO {
	private Long id;

	private Long userId;

	private LocalDate date;

	private int steps;

	private double distance;

	private int caloriesBurnt;

	public DailyActivityDTO() {
		super();
	}

	public DailyActivityDTO(Long id, Long userId, LocalDate date, int steps, double distance, int caloriesBurnt) {
		super();
		this.id = id;
		this.userId = userId;
		this.date = date;
		this.steps = steps;
		this.distance = distance;
		this.caloriesBurnt = caloriesBurnt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getCaloriesBurnt() {
		return caloriesBurnt;
	}

	public void setCaloriesBurnt(int caloriesBurnt) {
		this.caloriesBurnt = caloriesBurnt;
	}

	@Override
	public String toString() {
		return "DailyActivityDTO [id=" + id + ", userId=" + userId + ", date=" + date + ", steps=" + steps
				+ ", distance=" + distance + ", caloriesBurnt=" + caloriesBurnt + "]";
	}
}

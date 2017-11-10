package com.luv2code.springdemo;

public class MainApp {

	public static void main(String[] args) {
		Coach coach = new BaseballCoach();
		System.out.println(coach.getDailyWorkout());
	}

}

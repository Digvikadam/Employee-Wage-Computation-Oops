package com.bridgelabz;

import java.util.Random;
public class EmployeeWage {
	public static void main(String[] args) {
		int IS_PRESENT = 1;
		int RATE_PER_HR = 20;
		int emphrs = 0;
		int empwage = 0;
		Random r = new Random();
		int empcheck = r.nextInt(2);
		if(empcheck==IS_PRESENT) {
			System.out.println("Employee is Present");
			emphrs=8;
		}
		else {
			System.out.println("Employee is Absent");
			emphrs=0;
		}
		empwage = emphrs * RATE_PER_HR;
		System.out.println("empwage:" +empwage);
	}
}	
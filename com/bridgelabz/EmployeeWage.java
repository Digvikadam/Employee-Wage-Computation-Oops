package com.bridgelabz;

import java.util.Random;
public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
	
    public static void main(String[] args) {
		int empwage = 0;
		int emphrs = 0;
		Random r = new Random();
		int empcheck = r.nextInt(3);
		
		switch(empcheck) {
		case IS_PART_TIME:
			System.out.println("Employee is Present");
			emphrs = 4;
		break;
		
		case IS_FULL_TIME:
			System.out.println("Employee is Present");
			emphrs = 8;
			break;
		default:
			System.out.println("Employee is Absent");
			emphrs = 0;
		}
		empwage = emphrs * EMP_RATE_PER_HOUR;
		System.out.println("empwage:" +empwage);
	}
}	
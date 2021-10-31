package com.bridgelabz;

import java.util.Random;
public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    
    public static void main(String[] args) {
		int empwage = 0;
		int emphrs = 0;
		int totalEmpWage = 0;
		for (int day = 0; day <  NUM_OF_WORKING_DAYS; day++) {
		Random r = new Random();
		int empcheck = r.nextInt(3);
		switch(empcheck) {
		case IS_PART_TIME:
			System.out.println("Employee is Present");
			emphrs = 4;
			break;
		case IS_FULL_TIME:
			System.out.println("Employee Is Present");
			emphrs = 8;
			break;
		default:
			System.out.println("Employee is Absent");
			emphrs = 0;
		}
		empwage = emphrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empwage;
      		System.out.println("Emp Wage : " + empwage);
	    	}
		System.out.println("Total Emp Wage : " + totalEmpWage);
    }	
}	
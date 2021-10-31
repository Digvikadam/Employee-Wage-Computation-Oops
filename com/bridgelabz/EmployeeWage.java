package com.bridgelabz;

import java.util.Random;
public class EmployeeWage {
	public static void main(String[] args) {
		
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int RATE_PER_HR = 20;
		int emphrs = 0;
		int empwage = 0;
		Random r = new Random();
		int empcheck = r.nextInt(3);
		if(empcheck==IS_FULL_TIME) {
			System.out.println("Employee is Present");
			emphrs = 8;
		}
		else if(empcheck==IS_PART_TIME){
			System.out.println("Employee is Present ");
			emphrs = 4;	
		}
		else {
			System.out.println("Employee is Absent");
			emphrs = 0;
		}
		empwage = emphrs * RATE_PER_HR;
		System.out.println("empwage:" +empwage);
		
	}
}	
package com.bridgelabz;

import java.util.Random;
public class EmployeeWage {
	public static void main(String[] args) {
		final int IS_PRESENT = 1;
		Random r = new Random();
		int empcheck = r.nextInt(2);
		
		if(empcheck==IS_PRESENT) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}	
}	
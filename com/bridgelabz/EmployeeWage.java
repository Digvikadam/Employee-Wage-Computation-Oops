package com.bridgelabz;

import java.util.Random;
public class EmployeeWage {
     public static final int IS_PART_TIME = 1;
     public static final int IS_FULL_TIME = 2;
     public static final int EMP_RATE_PER_HOUR = 20;
     public static final int NUM_OF_WORKING_DAYS = 20;
     public static final int MAX_HRS_IN_MONTH = 100;

     public static void main(String[] args) {
    	 int empHrs = 0;
         int totalWorkingDays = 0;
         int totalEmpHrs = 0;
         while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
             totalWorkingDays++;
             Random r = new Random();
     		int empcheck = r.nextInt(3);
     		switch(empcheck) {
     		case IS_PART_TIME:
     			System.out.println("Employee is Present");
     			empHrs = 4;
     			break;
     		case IS_FULL_TIME:
     			System.out.println("Employee Is Present");
     			empHrs = 8;
     			break;
     		default:
     			System.out.println("Employee is Absent");
     			empHrs = 0;
     		}
     		 totalEmpHrs += empHrs;
             System.out.println("Day : " + totalWorkingDays + "Emp Hr: " +empHrs);
	        }
             int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
             System.out.println("Total Emp Wage : " + totalEmpWage);
      }     
}	
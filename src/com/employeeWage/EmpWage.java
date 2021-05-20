package com.employeeWage;

public class EmpWage {
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS = 100;

	public static void main(String[] args) {

		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalWorkingDays <= NUM_OF_WORKING_DAYS && totalEmpHrs <= MAX_HRS) {
			int empHrs = 0;
			int empWage = 0;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				totalWorkingDays++;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				totalWorkingDays++;
				break;
			default:
				empHrs = 0;

			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpHrs += empHrs;
			totalEmpWage += empWage;
			System.out.println("Emp Wage : " + empWage);
		}
		System.out.println("Total Emp Wage : " + totalEmpWage);

	}
}
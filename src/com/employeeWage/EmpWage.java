package com.employeeWage;

public class EmpWage {

	public static void main(String[] args) {

		int numberOfWorkingdays = 20;
		int maxHrs = 100;
		int empRatePerHour = 20;
		
		calculateWage calculatewage = new calculateWage();
		int totalHrs = calculatewage.totalHrs(numberOfWorkingdays,maxHrs);
		int totalWage = calculatewage.totalWage(totalHrs,empRatePerHour);
		System.out.println(totalWage);
	}
}

class calculateWage {
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	

	public int totalHrs(int numberOfWorkingDays, int maxHrs) {
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalWorkingDays <= numberOfWorkingDays && totalEmpHrs <= maxHrs) {
			int empHrs = 0;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;

			}
			System.out.println("Employee Hours For Day : " + totalWorkingDays + " " + empHrs);
			totalEmpHrs += empHrs;
			totalWorkingDays++;
		}
		return totalEmpHrs;
			
	}

	public int totalWage(int totalHrs, int empRatePerHour) {
		return empRatePerHour * totalHrs;
	}
}

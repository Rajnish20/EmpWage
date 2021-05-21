package com.employeeWage;

public class EmpWage {

	public static void main(String[] args) {

		int numberOfWorkingdays = 20;
		int maxHrs = 100;
		int empRatePerHour = 20;

		ComputeWage computeWage = new ComputeWage();
		int totalHrs = computeWage.totalHrs(numberOfWorkingdays, maxHrs);
		int totalWage = computeWage.totalWage(totalHrs, empRatePerHour);
		System.out.println(totalWage);
	}
}



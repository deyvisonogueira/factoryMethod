package model.us;

import model.Employee;

public class USLeader extends Employee {

	public USLeader() {
		super("L�der T�cnico Americano");
	}

	@Override
	public double calculateSalary() {
		return 9000;
	}
}
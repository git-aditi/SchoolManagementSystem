package com.company.schoolManagementSystem;

public class Teacher {

	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Creates a new Teacher object
	 * @param id id for the teacher
	 * @param name name of the teacher
	 * @param salary salary of the teacher
	 */

	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	/**
	 * 
	 * @return the id of the teacher
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * 
	 * @return the name of the teacher
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * @return the salary of the teacher
	 */
	public int getSalary() {
		return this.salary;
	}
	
	/**
	 * Adds to salary.
	 * Removes from the total money earned by the school.
	 * @param salary 
	 */
	public void recieveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	@Override
	public String toString() {
		return "Name of the Teacher: " + name + 
				". Total salary earned so far: $" + salaryEarned;
	}
}

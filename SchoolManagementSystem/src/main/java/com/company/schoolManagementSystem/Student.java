package com.company.schoolManagementSystem;

public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	/**
	 * To create a new student by initializing:
	 * 
	 * Fees for every studnet is $30,000 Fees paid initialy is $0
	 * 
	 * @param id    id for the student: unique
	 * @param name  name of the student
	 * @param grade grade of the student
	 */

	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	// Not going to alter student's name and id

	/**
	 * Used to update student's grade
	 * 
	 * @param grade new grade of the student
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * Keep adding fees to feesPaid field Add the fees to the feesPaid The school
	 * will recieve the funds
	 * 
	 * @param fees the fees student pays
	 */
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	/**
	 * 
	 * @return id of student
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return name of student
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return fees paid by student
	 */
	public int getFeesPaid() {
		return feesPaid;
	}

	/**
	 * 
	 * @return total fees of student
	 */
	public int getFeelsTotal() {
		return feesTotal;
	}
	
	/**
	 * 
	 * @return grade of student
	 */
	public int getGrade() {
		return grade;
	}
	
	/**
	 * 
	 * @return the remaining fees
	 */
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student's name: " + name + ". Total fees paid so far: " + feesPaid;
	}

}

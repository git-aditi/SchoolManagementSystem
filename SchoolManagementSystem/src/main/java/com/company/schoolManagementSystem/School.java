package com.company.schoolManagementSystem;

import java.util.*;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private int totalMoneySpent;
	
	/**
	 * 
	 * New school object is created
	 * @param teachers list of teachers in the school
	 * @param students list of students in the school
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

	/**
	 * 
	 * @return the list of teachers in the school
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Adds a teacher to school
	 * @param teachers the teacher to be added
	 */
	public void setTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * 
	 * @return the list of students in the school
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Adds student to school
	 * @param student the student to be added
	 */
	public void setStudents(Student student) {
		students.add(student);
	}

	/**
	 * 
	 * @return the total money earned by the school. 
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Adds the total money earned by the school.
	 * @param moneyEarned money that is supposed to be added
	 */
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	
	/**
	 * 
	 * @return the total money spent by the school.
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 *  Update the money that is spent by the school which is the 
	 *  salary given by the school to its teachers.
	 * @param moneySpent the money spent by the school.
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
	
	
	
	
}

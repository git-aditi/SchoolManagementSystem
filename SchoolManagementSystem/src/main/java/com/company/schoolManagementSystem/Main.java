package com.company.schoolManagementSystem;

import java.util.*;

public class Main {

	public static void main (String[] args) {
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellisa = new Teacher(1, "Mellisa", 700);
		Teacher vanderhorn = new Teacher(1, "Vanderhorn", 600);

		List<Teacher> teacherList = new ArrayList<>();
		
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);
		
		Student tamasha = new Student(1, "Tamasha", 4);
		Student rakshith = new Student (2, "Rakshith Vasudev", 12);
		Student rabbi = new Student (3, "Rabbi", 5);
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(tamasha);
		studentList.add(rabbi);
		studentList.add(rakshith);

		School ghs = new School(teacherList, studentList);
		System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned());
		
		tamasha.payFees(5000);
		System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned());
		
		rakshith.payFees(6000);
		System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned());

		System.out.println("------------ MAKING SCHOOL PAY SALARY ------------");
		lizzy.recieveSalary(lizzy.getSalary());

		System.out.println("GHS has spent for salary to " + lizzy.getName() +
				" and now has $" + ghs.getTotalMoneyEarned());
		
		vanderhorn.recieveSalary(vanderhorn.getSalary());

		System.out.println("GHS has spent for salary to " + vanderhorn.getName() +
				" and now has $" + ghs.getTotalMoneyEarned());

		System.out.println(rakshith);
		System.out.println(tamasha);
		
		mellisa.recieveSalary(mellisa.getSalary());
		
		System.out.println(mellisa);
		
	}
}
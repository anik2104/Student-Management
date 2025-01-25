package com.jsp.View;

import java.util.Scanner;

import com.jsp.Controller.StudebtController;
import com.jsp.Model.Student;

public class StudentView {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static Student getStudentObject()
	{
//		create the student type of Object
		Student s = new Student();
		System.out.println("Enter Id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		System.out.println("Enter Email:");
		String emain=sc.nextLine();
		System.out.println("Enter Password:");
		String pass=sc.nextLine();
		System.out.println("Enter DOB:");
		String dob=sc.nextLine();
		System.out.println("Enter Gender:");
		String gender=sc.nextLine();
		System.out.println("Enter Relationship:");
		String relationship=sc.nextLine();
		System.out.println("Enter Mob no:");
		long mob=sc.nextLong();
		
		
		s.setId(id);
		s.setName(name);
		s.setEmail(emain);
		s.setPassword(pass);
		s.setDob(dob);
		s.setGender(gender);
		s.setRelationShipStatus(relationship);
		s.setMob(mob);
		
		return s;
	}

	public static void main(String[] args){
		System.out.println("*Welcome to SMS PROJECT*\n\n\n\n");
		System.out.println("1. Create Student");
		System.out.println("2. Find Student by ID");
		System.out.println("3. Update Student by ID");
		System.out.println("4. Delete Student By ID");
		System.out.println("5. Find All Students");
		System.out.println("6. EXIT");
		
		StudebtController controller = new StudebtController();
		
		while (true) {
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
//				System.out.println("1. Create Student");
//				logic to create student type of object
				Student s = getStudentObject();
				controller.saveStudent(s);
				
				System.out.println("Student Saved");
				
//				save student method to store object 
				break;
			}
			case 2: {
//				System.out.println("2. Find Student by ID");
				System.out.println("Enter Id");
				int id=sc.nextInt();
//				findById
				controller.findById(id);
				break;
			}
			case 3: {
//				System.out.println("3. Update Student by ID");
				System.out.println("Enter Id");
				int id =sc.nextInt();
				Student su = getStudentObject();
				controller.updateById(id, su);
				break;
			}
			case 4: {
//				System.out.println("4. Delete Student By ID");
				System.out.println("Enter Id");
				int id = sc.nextInt();
				controller.removeById(id);
				break;
			}
			case 5: {
//				System.out.println("5. Find All Students");
				
//				findAll()
				controller.findAll();
				break;
			}
			case 6: {
				System.out.println("****Thank You*****");
				return;
				
			}
			default:
				System.out.println("Invaide Choice");
			}

			
		}
		
	}
}
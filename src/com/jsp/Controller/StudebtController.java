package com.jsp.Controller;

import java.util.ArrayList;

import com.jsp.Model.Student;
import com.jsp.View.StudentView;

public class StudebtController {
//	Bussiness Logic
	
	private ArrayList<Student> al = new ArrayList<Student>();
	
//	save student in ArrayList
	public void saveStudent(Student student) {
		
		al.add(student);
	}
	
	public void findAll() {
		for(Student s:al) {
			System.out.println(s);
		}
	}
	
	public void findById(int id) {
		for(Student s:al) {
			if(s.getId()==id) {
				System.out.println(s);
				return;
			}
			
		}
		System.out.println(id+"Id not found");
	}
	public void updateById(int id, Student su) {
		for (Student s : al) {
			if (s.getId()==id) {
				int i = al.indexOf(s);
				al.set(i, su);
				System.out.println("Record Updated Successfull");
//				Student s = Student.getS
			}
		}
	}
	public void removeById(int id) {
		for (Student s : al) {
			if (!s.toString().isEmpty()) {
				if (s.getId()==id) {
					al.remove(s);
				}
				else {
					System.out.println("Id not present");
				}
			}
			else {
				System.out.println("No data present");
			}
			
		}
	}
}

package com.java.hib;

public class AddStudentMain {
	public static void main(String[] args) {
		
		StudentDao student=new StudentDao();
		
		Student s=new Student("Naveen","Kumar","naveen@gmail.com");
		
		student.saveStudent(s);
		
		System.out.println(s.getFirstname()+" - "+s.getLastname()+s.getEmail());
		
	}

}

package com.newjava;

public class Student {
	// Fields
	String name;
	int age;

	// Default constructor
	public Student() {
		this.name = " ";
		this.age =1;
	}

	// Parameterized constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age ;
	}

	// Method to display student details
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		// Creating objects using different constructors
		Student student1 = new Student();
		Student student2 = new Student("JaySriRam", 21);
		Student student = new Student("Sumanth Reddy", 22);
		Student student3 = new Student();
		// Displaying the details of the students
		student1.display();
		student2.display();
		student.display();
		student3.display();
		student.display();
		student2.display();
	}
}



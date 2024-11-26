package com.newjava;

public class Javabean {

	private String name;
	private int age;
	private String department;
	public Javabean() {
		
	}
	
		public Javabean(String name, int age, String department) {
			this.name = name;
			this.age = age;
			this.department = department;
		}
		public String getName() {
			return name;
		
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartmen(String department) {
			this.department = department;
		}
		public static void main(String [] args) {
			Javabean student = new Javabean("Sumanth Reddy",22,"MCA");
			System.out.println("Name:"+student.getName()+"\nAge:"+student.getAge()+"\nDepartment:"+student.getDepartment());
		}
	}

		
package com.newjava;

public class Person {
String firstName;
String lastName;
int age;
public Person() {
	this.firstName="Sumanth";
	this.lastName="Reddy";
	this.age=22;
}
public void display() {
	System.out.println("FullName :"+firstName+lastName);
	System.out.println("Age:"+age);
}
    public static void main(String[] args) {
		Person p=new Person();
		p.display();
	}
}

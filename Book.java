package com.newjava;

public class Book {
String title ;
String author ;
double price;
public Book () {
	this.title="Untitled";
	this.author="Unknown";
	this.price= 0.0;
}
public Book(String title, String author, double price) {
	this.title=title;
	this.author=author;
	this.price=price;
}
public void display() {
	System.out.println("Title :"+title);
	System.out.println("Author:"+author);
	System.out.println("Price :"+price);
}
public static void main(String[] args) {
	Book b1=new Book();
	Book b2=new Book("Lion","Sukumar",200);
	b1.display();
	b2.display();
}
}

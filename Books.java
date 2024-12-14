package com.newjava;

public class Books {
		String title ;
		String author ;
		double price;
		public Books () {
			this.title="Untitled";
			this.author="Unknown";
			this.price= 0.0;
		}
		public Books(String title, String author, double price) {
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
			Books b1=new Books();
			Books b2=new Books("Lion","Sukumar",200);
			b1.display();
			b2.display();
		}
		}


package com.newjava;
import java.util.ArrayList;
import java.util.List;
	class Book {
	    private String title;
	    private String author;

	    // Constructor
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    // Getters
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }
	}

	class Library {
	    private List<Book> books;

	    // Constructor
	    public Library() {
	        this.books = new ArrayList<>();
	    }

	    // Method to add a book to the library
	    public void addBook(Book book) {
	        books.add(book);
	    }

	    // Method to display books in the library
	    public void displayBooks() {
	        for (Book book : books) {
	            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
	        }
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Create book objects
	        Book book1 = new Book("1984", "George Orwell");
	        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

	        // Create library object and add books to it
	        Library library = new Library();
	        library.addBook(book1);
	        library.addBook(book2);

	        // Display books in the library
	        library.displayBooks();
	    }
	}



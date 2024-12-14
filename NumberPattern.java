package com.newjava;
	public class NumberPattern {
	    public static void main(String[] args) {
	        int numberOfRows = 5; // You can change this value for more rows
	        
	        for (int i = 1; i <= numberOfRows; i++) { // Loop through rows
	            for (int j = 1; j <= i; j++) { // Loop through columns
	                System.out.print(i + " "); // Print the current row number
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}



package com.newjava;
	import java.util.Scanner;

	public class TrapeziumPatternSimple {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number of rows
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        
	        int startWidth = 2; // Starting width

	        for (int i = 0; i < rows; i++) {
	            int currentWidth = startWidth + i;
	            for (int j = 0; j < currentWidth; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}


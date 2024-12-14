package com.newjava;
	import java.util.Scanner;

	public class TrapeziumPattern {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input parameters
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the starting width: ");
	        int startWidth = scanner.nextInt();
	        System.out.print("Enter the ending width: ");
	        int endWidth = scanner.nextInt();

	        // Calculate the width increment per row
	        int widthIncrement = (endWidth - startWidth) / (rows - 1);

	        for (int i = 0; i < rows; i++) {
	            int currentWidth = startWidth + (i * widthIncrement);
	            for (int j = 0; j < currentWidth; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}



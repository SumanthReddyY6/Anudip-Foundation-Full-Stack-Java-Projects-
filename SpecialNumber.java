package com.newjava;
import java.util.Scanner;
public class SpecialNumber {
	    
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int start=sc.nextInt();
	    	int end=sc.nextInt();
	    	
	    	if(start>=10 && end<=99) {
	    		findSpecialNumbers(start,end);
	    	}
	    	
	        sc.close();
	    }

	    public static void findSpecialNumbers(int a, int b) { 	
	        for (int i = a; i <= b; i++) { 
	            int sumOfDigits = sumOfDigits(i);
	            int productOfDigits = productOfDigits(i);
	            if ((sumOfDigits + productOfDigits) == i) {
	                System.out.println(i);
	            }
	        }   	
	    }

	    public static int sumOfDigits(int num) {
	        int sum = 0;
	        while (num > 0) {
	            sum += num % 10;
	            num /= 10;
	        }
	        return sum;
	    }

	    public static int productOfDigits(int num) {
	        int product = 1;
	        while (num > 0) {
	            product *= num % 10;
	            num /= 10;
	        }
	        return product;
	    }
	}

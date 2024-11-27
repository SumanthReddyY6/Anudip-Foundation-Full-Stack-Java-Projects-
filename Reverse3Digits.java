package com.newjava;
import java.io.*;
import java.util.*;
public class Reverse3Digits {

	public static void main(String args[])
	{
		int n,fd,md,ld,rev;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a three digit number");
		n=sc.nextInt();
		fd=n/100;
		md=(n/10)%10;
		ld=n%10;
		rev=ld*100+md*10+fd;
		System.out.print("Reverse=" + rev);
	}
}


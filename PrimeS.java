package com.newjava;
import java.io.*;
import java.util.*;
public class PrimeS {
	    public static void main(String[] args) {
	        {
	            Scanner sc = new Scanner(System.in);
	            int n,prime;
	            n = sc.nextInt();
	            for(int i =2; i<=n;i++)
	            {
	                prime = 1;
	                for(int j =2; j<=i/2;j++)
	                {
	                    if(i%j==0)
	                    {
	                        prime =0;
	                        
	                        break;
	                    }
	                }
	                if(prime==1)
	                    System.out.print(i + " ");
	                    }
	                }
	            }
	}


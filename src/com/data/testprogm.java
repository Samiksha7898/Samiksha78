package com.data;

import java.util.Scanner;

public class testprogm {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		int a, b ;
		
		float c,d ;
		
		String name = " " ; 
		
		System.out.println("Enter value of a : ");
		a=ob.nextInt();
		
		System.out.println("Enter value of b : ");
		b=ob.nextInt();
		
		System.out.println("ADD = " + (a+b));
		
		System.out.println("Enter value of c : ");
		c=ob.nextFloat();
		
		System.out.println("Enter value of d : ");
		d=ob.nextFloat();
		
		
		System.out.println("SUB = " + (c-d));
		
		System.out.println("Enter Your Name : ");
		name=ob.next();
		
		
		System.out.println("Enter Name : " + (name));
		
		
		ob.close();

	}

}

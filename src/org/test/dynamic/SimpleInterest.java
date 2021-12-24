package org.test.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double p,r,t,i;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		System.out.println("Principal Amount :");
		p=Double.parseDouble(ob.readLine());
		
		System.out.println("Rate of Interest :");
		r=Double.parseDouble(ob.readLine());
		
		System.out.println("Time :");
		t=Double.parseDouble(ob.readLine());
		
		i = (p*t*r)/100;
		
		System.out.println("Intersest="+ i);
		

	}

}

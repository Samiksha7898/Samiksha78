package org.test.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		Double r, pi =3.14 , area , peri ;
			
			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader ob= new BufferedReader(in);
		
			System.out.println("Enter The Radius : ");
			
			r = Double.parseDouble(ob.readLine());
			
			area = pi*r*r;
			
			peri = 2*pi*r ;
			
			System.out.println("Area : " + area);
			
			System.out.println("Peri : " + peri);
	}

}

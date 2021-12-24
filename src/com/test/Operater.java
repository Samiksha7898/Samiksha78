package com.test;

public class Operater {

	public static void main(String[] args) {
	 int a=56 ,b=35, c=76 , x = 10;
	 System.out.println(a+b);
	 System.out.println(a-b);
	 System.out.println(a*b);
	 System.out.println(a/b);
	 System.out.println(a%b);
	 
	 System.out.println(a>b && b>c);
	 System.out.println(a>b  ||  b>c);
	 System.out.println(a!= b);
	 System.out.println(a==b);
	 
	 a+=5;
	 System.out.println(a);
	 a-=5;
	 System.out.println(a);
	 a*=2;
	 System.out.println(a);
	 a/=4;
	 System.out.println(a);
	 
	 System.out.println(--x + --x + --x);
	 
	 int y=(20>30)?20:30;
	 System.out.println(y);
	 
	String s=(20>30)?"Java":"C++";
	System.out.println(s);
	 
	 
	 
	 
	 

	}

}

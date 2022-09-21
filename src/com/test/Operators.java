package com.test;

public class Operators {

	public static void main(String[] args) {
		 int a=90,b=90,c=50;
	        
	        if(a<b || b>c) // F && T -> F
	        {
	            System.out.println("Hello world!!");
	        }
	        
	        if(a!=b) 
	        {
	            System.out.println("Its false");
	        }
	        else
	        {
	            System.out.println("Its true");
	        }
	        
	        
	        if((a==b)!=true) //true != true
	        {
	            System.out.println("Its equal");
	        }
	        else
	        {
	            System.out.println("Its not equal");
	        }
	        
	        
	        System.out.println(a+b);
	        System.out.println(a/b);
	        System.out.println(a%b);
	        System.out.println(a>b && b>c);
	        
	        a=10;
	        b=20;
	        c=30;
	        int result=a>b? a>c?a:c  : b>c?b:c;
	        System.out.println(result);
	        
	        a=5; 
	        b=7;  
	        
	        System.out.println(a & b);
	        System.out.println(a | b);
	        System.out.println(a ^ b);
	        System.out.println(~a);
	        System.out.println(a>>2);
	        System.out.println(a<<2);

	}

}

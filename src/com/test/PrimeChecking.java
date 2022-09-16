package com.test;

public class PrimeChecking {

	public static void main(String[] args) {
		
		int i,count=0;
		  
		  for(int j=1;j<=100;j++)  //5
		  { 
			 
		  if(j!=1)
		  {
			for(i=1;i<=j;i++)     //23  (2 - 11)  7  (2-3)  (2 - square root(n)) 
			{
				if(j%i==0)         
				{
				 count=count+1;      
			    }
			}
			
			if(count==2)
			{
				System.out.print(j+"\n");
			}
			 count=0;
		  }

		  }	
	}

}

package org.tact;

import java.util.Scanner;

class com{
 public static final int possible = 0;
 public static final int question = 0;
 
public void possible(){
	 int possible = 2;
 }
public void question() {
	// TODO Auto-generated method stub
	int question =2;
	
}
	
	
}
public class Combination {
  
	int result = 1;


	Combination(int a,int b){
	 
	       if(b==0&&a>=0)
	    	   
	           System.out.println(result);
	       
	        else if(a==0&&b>=1) {
	             result = 0;
	             System.out.println(result);
	         }

	        else{
	           for(int i=1;i<=b;i++){
	               result*= a;
	          }
	    //return result;
	  }

	System.out.println( b + " questions "+" - "+result+" combination");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		com  c = new com();

		System.out.println("enter the how many possible:");
	     c.possible();

		System.out.println("enter the how many Question:");
		 c. question();

		new Combination(c.possible,c.question);

	}

}

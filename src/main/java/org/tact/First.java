package org.tact;

import java.util.Scanner;

class a1{
	static int count=0,k=5;
	int b[] = new int[10]; //instance variable
	
	void print(int num){
		System.out.println(num+ " "+count);
		
		count = 0;
		
	}
  }

  class PerfectSqure extends a1{  //inheritance is a relationship
	  
		void  a1(int num){
			int half = num/2;
			   if(half*half == num){
				   count+=5;
			   }
		}
  }
  
  class EvenNumber extends PerfectSqure{
	
	void evenNumber(int num){
		if ((num%2)== 0){
			   count += 3;
		   }
	}
	
  }
  
  class Multiple extends EvenNumber{  //multilevel inheritance
	  
	void multipleFourandSix(int num){
		   if((num %4 == 0 )&&(num%6) == 0){
			   count+=4;
		   }
	}
  }
	
  

public class First {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int num = sc.nextInt();
		 int[] a = new int [num];
		for(int i=0;i<num;i++){
			a[i] = sc.nextInt();
		}
		a1 obj;
		obj = new a1(); // aggrection is a Has relationship
		Multiple a2 = new Multiple(); //create an object in last class 
			for(int i=0;i<num;i++){
			a2.a1(a[i]); // constructor
			a2.evenNumber(a[i]);
			a2.multipleFourandSix(a[i]);
			obj.print(a[i]);		
			}
			
		 //get(){
			System.out.println("extends"+obj.k);
		}
			
			
	}

	
	//a2.sort(num);



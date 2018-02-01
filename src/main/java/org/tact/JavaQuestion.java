package org.tact;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

public class JavaQuestion {
	private Random  rm;
	//private List<String> al;
	

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// void getQuestion(){
		List <String> al = new ArrayList<String>(20);
		al.add("what is string java");
		al.add("how to split spring in java");
		al.add("what is spring pool");
		al.add("can we use string in switch case");
		al.add("why string is popular hashmapkey in java");
		al.add("what are different ways");
		al.add("how to convert string to char");
		al.add("How many types of memory areas are allocated by JVM");
		al.add("What is JIT compiler");
		al.add("What is platform");
		al.add("What is the main difference between Java platform and other platforms");
		al.add("What gives Java its 'write once and run anywhere' nature");
		al.add("What is classloader");
		al.add("Is Empty .java file name a valid source file name");
		al.add("Is delete,next,main,exit or null keyword in java");
		al.add("What if I write static public void instead of public static void");
		al.add("What is the default value of the local variables");
		al.add("What is constructor");
		al.add("What is the purpose of default constructor");
		al.add("Does constructor return any value");

		getQuestion(al);
	}
 
 
	static void getQuestion(List al) {
		Random rm = new Random(al.size());
	
		for (int i = 0; i < 5; i++) {
			
			//int m= rm.nextInt();
			//System.out.println(al.get(m).toString());
			System.out.println(al.get(rm.nextInt(al.size())));
			
		}
	}

	/*
	 * void getquestion1(){ System.out.print() }
	 */

}

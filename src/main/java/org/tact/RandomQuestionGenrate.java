package org.tact;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class RandomQuestionGenrate {

	static int count = 0;
	static int count1 = 0;
    static int quest = 1;
	private Random  rm;
	public static void main(String[] args) throws InterruptedException {
		
		RandomQuestionGenrate rg = new RandomQuestionGenrate();
		rg.start();
	}
	
	void start() throws InterruptedException{
		
		List <String> tech = new ArrayList<String>(20);
		tech.add("tech 1 :: what is string java");
		tech.add("tech 2 :: how to split spring in java");
		tech.add("tech 3 :: what is spring pool");
		tech.add("tech 4 :: can we use string in switch case");
		tech.add("tech 5 :: why string is popular hashmapkey in java");
		tech.add("tech 6 :: what are different ways");
		tech.add("tech 7 :: how to convert string to char");
		tech.add("tech 8 :: How many types of memory areas are allocated by JVM");
		tech.add("tech 9 :: What is JIT compiler");
		tech.add("tech 10 :: What is the main difference between Java platform and other platforms");
	
		List <String> behavioral= new ArrayList<String>(20);
		behavioral.add("behavioral 1");
		behavioral.add("behavioral 2");
		behavioral.add("behavioral 3");
		behavioral.add("behavioral 4");
		behavioral.add("behavioral 5");
		behavioral.add("behavioral 6");
		behavioral.add("behavioral 7");
		behavioral.add("behavioral 8");
		behavioral.add("behavioral 9");
		behavioral.add("behavioral 10");
		
		getQuestion(tech, behavioral);
		
	}
	
	static void getQuestion(List tech, List behavioral) throws InterruptedException {
		
		Random rm = new Random(tech.size());
		Random rm1 = new Random(behavioral.size());
	
		for (int i = 0; i < 5; i++) {
			
			//Thread.sleep(2000);
			
			System.out.println("---------------------------------------------------------------------");
		
			if(count < 3 && quest == 1){ 
				System.out.println("Q"+(i + 1)+" --> "+ tech.get(rm.nextInt((tech.size()))));
				count++;
				quest = 0;
			} else if(count1 < 2 && quest == 0){
				System.out.println("Q"+(i+1)+" --> "+ behavioral.get(rm1.nextInt((behavioral.size()))));
				count1++;
				quest = 1;
				}
			
			
			Scanner reader = new Scanner(System.in);  // Reading from System.in
		    System.out.println("Enter your answer: ");
		    String answer = reader.next();
		    
		    System.out.println("Your answer  : "+answer);
			
		}
	}


}

package org.tact;

import java.util.List;
import java.util.Random;

/**
 * 
 * 	@author raja csp
 *
 *	Version: 1.0.1
 *  Date: Jan 31, 2018	
 *
 *	sources used:
 *		https://stackoverflow.com/questions/13796928/how-to-get-unique-values-from-array
 *		https://stackoverflow.com/questions/20039025/java-array-of-unique-randomly-generated-integers
 */
public class WordSearchMaker3 {
	
	static final boolean TESTING_MODE = true;

	public static void main(String[] args){
		WordSearchMaker3 qMaker = new WordSearchMaker3();
		qMaker.start();
	}
	
	private void start(){
		
		// Type 2 - Stackoverflow based questions
		getWordSearchQuestions("java");		
	}
	
	private static int currntKeyCounter = 0;		
	private static String[] javaKeys = {
		"java",
		"php",
		"thread",
		"jenkins",
		"junit",
		"multithreading"
	};
	private static final int BORDER_LENGTH = 5;
	
	/*
	 * Would reflect WordSearch
	 * 
	 * Keys:
	 * 		Java
	 * 		Multithreading
	 * 		Jenkins
	 * 		Git
	 * 
	 * 	Note: This code is not efficient, hence no performance at all.
	 */	
	private List<String> getWordSearchQuestions(String programming){
		
		String[] keys = javaKeys;
		if(programming.equalsIgnoreCase("java")){
			keys = javaKeys;
		                                        }
		
		int maxColumns = getMaxColumns(keys);
		//System.out.println("Max columns : "+maxColumns);
		
		// insert key in random place				
		for(int columnIndex=0;columnIndex<keys.length;columnIndex++){
			
			String line = "";
			
			currntKeyCounter = 0; //set zero in every line
			
			int place = getRandomPlace(keys[columnIndex], maxColumns);
			
			//System.out.println(place);
			
			for(int lineIndex=0;lineIndex<maxColumns;lineIndex++){
				if(columnIndex < keys.length)				
					line = getLine(line, lineIndex, keys[columnIndex], place);
				else
					line += "* ";
			}
			System.out.println(line);
		}
		
		return null;
	}
	
	private String getLine(String line, int j, String key, int place){
		
		if(j >= place && j <(place+key.length()) ){							
			line += key.toCharArray()[currntKeyCounter] + " ";
			currntKeyCounter++;
			
			return line;
		}				
		
		line += getChar()+" ";
		return line;
	}
	
	private int getRandomPlace(String key, int maxColumns){
		int place = maxColumns - key.length();
		return getRandom(0, place);		
	}
	
	private int getMaxColumns(String[] keys){
		
		//return 20;
		int maxColumns = 0;
		for (String string : keys) {
			if(maxColumns <= string.length() + BORDER_LENGTH){
				maxColumns = string.length() + BORDER_LENGTH;
			}
		}
		
		return maxColumns;
		
	}
	
	private char getChar(){
		
		if(TESTING_MODE){
			return getX();
		}
		
		String chars = "abcdefghijklmnopqrstuvwxyz";
		
		int n = 0 + (new Random()).nextInt(chars.length());
		
		return chars.toCharArray()[n];		
	}
	
	private static int getRandom(int min, int max){
		return min + (new Random()).nextInt(max);
	}
	
	private char getX(){
		return 'x';		
	}
}

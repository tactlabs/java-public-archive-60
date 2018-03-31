package org.tact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BehavioralTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> javalist= new ArrayList<String>();
		javalist.add("java");
		javalist.add("java1");
		
		ArrayList<String> nodejslist = new ArrayList<String>();
		nodejslist.add("nodejs");
		nodejslist.add("nodejs1");
	
		HashMap<String,ArrayList> hmt = new HashMap<String,ArrayList>();
		hmt.put("java", javalist);
		hmt.put("nodejs", nodejslist);
		
		System.out.println("Enter the topic:");
		String topic = sc.next();
		
		System.out.println(hmt.get(topic));
		
	
		
	}	
	

	

}

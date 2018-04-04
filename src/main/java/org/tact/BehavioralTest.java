package org.tact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BehavioralTest {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		List<Map<String, Object>> dbList = new ArrayList<Map<String, Object>>();

		Map<String, Object> mp1 = new HashMap<String, Object>();
		mp1.put("question", "what is java uses");
		mp1.put("code", "dummycode:1");
		// mp1.put("level", 1);
		// mp1.put("category", "medium");
		mp1.put("topic", "java");
		dbList.add(mp1);

		Map<String, Object> mp2 = new HashMap<String, Object>();
		mp2.put("question", "java q 1");
		mp2.put("code", "dummycode:1");
		// mp1.put("level", 1);
		// mp1.put("category", "medium");
		mp2.put("topic", "java");
		dbList.add(mp2);

		Map<String, Object> mp3 = new HashMap<String, Object>();
		mp3.put("question", "node q 1");
		mp3.put("code", "dummycode:2");
		// mp1.put("level", 1);
		// mp1.put("category", "medium");
		mp3.put("topic", "node");
		dbList.add(mp3);

		Map<String, Object> mp4 = new HashMap<String, Object>();
		mp4.put("question", "node q 1");
		mp4.put("code", "dummycode:3");
		// mp1.put("level", 1);
		// mp1.put("category", "medium");
		mp4.put("topic", "node");
		dbList.add(mp4);
		// int numb=sc.nextInt();
		
		HashSet<Object> s = new HashSet<Object>();

		for (Map<String, Object> entry : dbList) {
			s.add(entry.get("topic"));
			// System.out.println("d");
		}
		
		Iterator i = s.iterator();
		for (Object val : s) {
			System.out.println("\"" + val + "\" = [");
			String input = String.valueOf(val);
			for (Map<String, Object> entry : dbList) {
				if (entry.get("topic").equals(input)) {
					System.out.println(entry);					
				}
			}
			System.out.println("]");
		}

		/*
		 * "java" = [ {code=dummycode:1, question=what is java uses,
		 * topic=java}, {code=dummycode:1, question=j2, topic=java} ],
		 * 
		 * "node" = [ {code=dummycode:1, question=node 1, topic=java},
		 * {code=dummycode:1, question=node 2, topic=java} ],
		 */

	}
}

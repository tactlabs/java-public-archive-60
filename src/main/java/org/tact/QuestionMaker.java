package org.tact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author raja
 *
 *
 *	
 */

public class QuestionMaker {

	public static void main(String[] args){
		QuestionMaker qMaker = new QuestionMaker();
		qMaker.start();
	}
	
	public void start(){
		
		List<Integer> uniqueList = getUniqueIndexList(20, 3);
		
		//System.out.println(uniqueList);
		//System.out.println(uniqueList.size());
		
		// Type 1 - Java basic questions	
		
		
		// Type 2 - Stackoverflow based questions
		List<String> stQustionList = getStackoverflowQuestions("java", 3);
		System.out.println("\nStackoverflow Questions : ");
		printList(stQustionList);
		
		// Type 3 - Word search
		List<String> basicQustionList = getBascicQuestions("java", 3);
		System.out.println("\nBasic Questions : ");
		printList(basicQustionList);
		
		// Type 4 - Real time situations
		List<String> realTimeQustionList = getRealtimeQuestions("java", 3);
		System.out.println("\nRealtime Questions : ");
		printList(realTimeQustionList);
		
		// Type 5 - Behavioral Questions
		List<String> behavioralQustionList = getBehavioralQuestions("java", 3);
		System.out.println("\nBehavioral Questions : ");
		printList(behavioralQustionList);
	}
	
	// only Java now
	public List<String> getStackoverflowQuestions(String programming, int maxQuestions){
		
		// load these questions from DB/Properties
		List<String> qsList = new LinkedList<String>();
		qsList.add("Why SimpleDateFormat is not threadsafe? What's the business impact when we use multi thread and SimpleDateFormat?");
		qsList.add("Why using java.sql.date is restricted?");
		qsList.add("Why enums in Java?");
		qsList.add("Have you used maven plugins? if yes, do you know anything about surefire-plugin and failsafe-plugin?");
		qsList.add("When you extended a String class and override the toString method of String class, what would happen?");
		qsList.add("What's the difference between build-plugin and profile-plugin in Maven?");
		qsList.add("What is git-porcelain, or low-level like git-plumbing?");
		qsList.add("How to create the “Circular view path” exception with Spring MVC test");
		qsList.add("When the booking order, double booking might be possible on the same email id. However double booking will happen every 1000 entries. How to avoid it?");
		qsList.add("What's the problem with BoneCP? Why you won't recommend BoneCP?");
		qsList.add("What is slow query logging?");
		qsList.add("Does HikariCP caches the statement? If Yes/No, why?");
		
		// check maxQuestions vs qaList count; if maxQuestions is greater, throw exception
		
		return getUniqueQuestions(qsList, maxQuestions);
	}
	
	public List<String> getUniqueQuestions(List<String> qsList, int maxQuestions){
		List<Integer> unique = getUniqueIndexList(qsList.size(), maxQuestions);
		
		List<String> qsListNew = new LinkedList<String>();
		for (Integer integer : unique) {
			qsListNew.add(qsList.get(integer));
		}
		
		return qsListNew;
	}
	
	public List<String> getBascicQuestions(String programming, int maxQuestions){
		
		List<String> qsList = new LinkedList<String>();
		qsList.add("@getmapping vs @requestmapping");
		qsList.add("Does HikariCP caches the statement? If Yes/No, why?");
		qsList.add("What is Optimistic Concurrency control and how to achieve in Mybatis");
		qsList.add("What's the big issue you faced with com.fasterxml.jackson.core jackson-core");
		qsList.add("How multiple query insertion is dealt in Hibernate?");
		qsList.add("createQuery(), createNamedQuery() and createNativeQuery()");
		qsList.add("SingleCache, MultiCache, AssignCache");
		qsList.add("org.springframework.core.env.PropertySourcesPropertyResolver - What is this in Spring?");
		qsList.add("How to use multiple entity managers in Spring JPA?");
		qsList.add("Auto-boxing and unboxing in java?");
		qsList.add("Java Reflect performance issues");
		qsList.add("Case insensitive history in Spring");
		qsList.add("Lazy init in Spring");
		qsList.add("Is Spring MVC REST is case sensitive?");
		qsList.add("What is REST?");
		qsList.add("Is SimpleDateFormat threadsafe?");
		qsList.add("Log4j is thread-safe?");
		qsList.add("Log4j vs Slf4j");
		qsList.add("Request Body vs Request Param");
		qsList.add("LinkedList vs ArrayList");
		
		return getUniqueQuestions(qsList, maxQuestions);
	}

	// will be implemented later
	// Would refect WordSearch
	/*
	 * Keys:
	 * 		Java
	 * 		Multithreading
	 * 		Jenkins
	 * 		Git
	 * 
	 */
	public List<String> getWordSearchQuestions(String programming, int maxQuestions){
		
		List<String> qsList = new LinkedList<String>();
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		qsList.add("");
		
		return null;
	}
	
	public List<String> getRealtimeQuestions(String programming, int maxQuestions){
		
		/*
		 * 
		 
		 	http://www.baeldung.com/exception-handling-for-rest-with-spring - Handle multiple resolver by using this article. Walk through the scenario
		  
		 	Perm Gen
			https://www.youtube.com/watch?v=PUUJ4rNpRhU
			
			How many times do you use Stackoverflow daily?
			What are the good,bad things about Stackoverflow?
			
			Pagination in Youtube playlist:
			https://developers.google.com/youtube/v3/guides/implementation/pagination
			
			how to compare two util date in java?
			compare two util dates in java
			
			Find lombok pros and cons
			
			find youtube short url algorithm.
			
			What is 'staged' and 'unstaged' changes in Git?
			
			What is octal permission:
			https://unix.stackexchange.com/questions/174787/assigning-read-write-privileges-for-a-folder-to-a-user-in-centos-7
			
			reload is not working in angularjs
			What might be the cases for above issue
			
			Kanban vs Scrum
			
			Have you ever reverted the changes on SVM / GIT / HG? If yes, how did you do it?
			
		 */
		
		List<String> qsList = new LinkedList<String>();
		qsList.add("http://www.baeldung.com/exception-handling-for-rest-with-spring - Handle multiple resolver by using this article. Walk through the scenario");			 
		qsList.add("Perm Gen - https://www.youtube.com/watch?v=PUUJ4rNpRhU - Explain about it");			
		qsList.add("How many times do you use Stackoverflow daily? - What are the good,bad things about Stackoverflow?");			
		qsList.add("Pagination in Youtube playlist: - https://developers.google.com/youtube/v3/guides/implementation/pagination");			
		qsList.add("how to compare two util date in java? - compare two util dates in java");			
		qsList.add("Find lombok pros and cons");			
		qsList.add("find youtube short url alorithm.");			
		qsList.add("What is 'staged' and 'unstaged' changes in Git?");			
		qsList.add("What is octal permission: - https://unix.stackexchange.com/questions/174787/assigning-read-write-privileges-for-a-folder-to-a-user-in-centos-7");			
		qsList.add("reload is not working in angularjs - What might be the cases for above issue");			
		qsList.add("Kanban vs Scrum - Have you ever reverted the changes on SVM / GIT / HG? If yes, how did you do it?");
		
		return getUniqueQuestions(qsList, maxQuestions);
	}
	
	public List<String> getBehavioralQuestions(String programming, int maxQuestions){
		
		List<String> qsList = new LinkedList<String>();
		qsList.add("If you are given a Java director position by Oracle, which technical changes would you bring in Java technologies? Why?");
		qsList.add("one");
		qsList.add("two");
		qsList.add("three");
		qsList.add("four");
		qsList.add("five");
		qsList.add("six");
		qsList.add("seven");
		qsList.add("eight");
		qsList.add("nine");
		qsList.add("ten");
		qsList.add("eleven");
		qsList.add("twelve");		
				
		return getUniqueQuestions(qsList, maxQuestions);
	}
	
	public List<Integer> getUniqueIndexList(Integer max, int needed){
		
		int neededCount = 0;
		
		List<Integer> a = new ArrayList<>(11);
		for (int i = 0; i <= max; i++){ //to generate from 0-10 inclusive. 
		                               //For 0-9 inclusive, remove the = on the <=			
			if(neededCount >= needed)
				break;
			
		    a.add(i);
		    
		    neededCount++;
		}
		Collections.shuffle(a);
		a = a.subList(0, needed);		
		
		return a;
	}
	
	public void printList(List<String> list){
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	/**
	 * Resources used:
	 * 
	 * 		
	 * 		https://stackoverflow.com/questions/13796928/how-to-get-unique-values-from-array
	 *		https://stackoverflow.com/questions/20039025/java-array-of-unique-randomly-generated-integers
	 * 
	 * 
	 */
}

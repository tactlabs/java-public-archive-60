package org.tact;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import javax.management.Query;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

public class TwitterTweetsPreviousWeek {
	
	private static String twtConsumerKey = "m19IMoIFCdSmCeKOA43K0SuuD";

	private static String twtConsumerSecret = "D56NklMyKAgtgp3ZxdQNQITsxugpS54P44vVS9rWA5wQ3Fekgh";

	private static String twtAccessToken = "3387978868-bzW7KiZZmuAGD9EhdI81GgHZDu7f9rPjuqNHqzQ";

	private static String twtAccessTokenSecret = "kmJjsVp5Vz7obs0alZBnwvBhsr9hOt5mn3fSddFF91F8o";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the handle:");
		String handle = sc.next();
		getTwitterFeeds(handle);
	}
	
	private static void getTwitterFeeds(String handle) {
		 			
		try {

			TwitterTemplate twitterTemplate = new TwitterTemplate(
					twtConsumerKey, twtConsumerSecret, twtAccessToken,
					twtAccessTokenSecret);
			List<Tweet> tweets = twitterTemplate.timelineOperations().getUserTimeline(handle, 15);	
			
		    java.util.Date date=new java.util.Date(); // today date
		    //System.out.println("date :" + date);
		    List<String> al = new ArrayList<String>();
		    
			for (Tweet tweet : tweets) {
				Date date1 = tweet.getCreatedAt();  // tweets date
				//Date msg = new Date();
				int diffdays = (int) ((date.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));
				//System.out.println("diff :" + diffdays);
				String tweetContent = tweet.getText();
				
				if(diffdays < 7){  //how to compare two dates
				//System.out.println("date :" + date1);
				al.add(tweetContent);
				//System.out.println("TWEET TEXT :" + tweetContent);			
				}
			}	
			for(int i=0;i<al.size();i++) {
				if(al.get(i).substring(0,2).equals("RT")){ //remove the RT
					
				}else{
					System.out.println(al.get(i));	
				}
	            
	        }
		} catch (Exception e) {
			 e.printStackTrace();
			 System.err.println("{getTwitterFeeds} error occured  : "+ e.getMessage());
		}
		
	}


}


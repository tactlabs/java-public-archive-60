package org.tact;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

	//@param Arrays String[];

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
			
			

			List<Tweet> tweets = twitterTemplate.timelineOperations().getUserTimeline(handle, 150);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		    LocalDateTime now = LocalDateTime.now(); 
		   // Date tdydate = dtf.format(now);
		    java.util.Date date=new java.util.Date();
			for (Tweet tweet : tweets) {
				
				Date Created = tweet.getCreatedAt();
				Date msg = new Date();
				
				String tweetContent = tweet.getText();
				if(date.compareTo (Created) < 0){
				System.out.println("TWEET TEXT :" + tweetContent);
				System.out.println("TWEET TEXT :" + Created);
				System.out.println("TWEET TEXT :" + Created);
				}
			}
			

		} catch (Exception e) {
			 e.printStackTrace();
			 System.err.println("{getTwitterFeeds} error occured  : "+ e.getMessage());
		}
		
		
	}


}


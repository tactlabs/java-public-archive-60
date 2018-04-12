package org.tact;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.social.twitter.api.UserList;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.social.twitter.connect.TwitterConnectionFactory;


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

			for (Tweet tweet : tweets) {
				
				String tweetContent = tweet.getText();
				System.out.println("TWEET TEXT :" + tweetContent);
			}
			

		} catch (Exception e) {
			 e.printStackTrace();
			 System.err.println("{getTwitterFeeds} error occured  : "+ e.getMessage());
		}
		
		
	}


}

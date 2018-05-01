package org.tact;

import java.util.List;
import java.util.Scanner;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

public class TwitterAngle {

	
		private static String twtConsumerKey = "m19IMoIFCdSmCeKOA43K0SuuD";

		private static String twtConsumerSecret = "D56NklMyKAgtgp3ZxdQNQITsxugpS54P44vVS9rWA5wQ3Fekgh";

		private static String twtAccessToken = "3387978868-bzW7KiZZmuAGD9EhdI81GgHZDu7f9rPjuqNHqzQ";

		private static String twtAccessTokenSecret = "kmJjsVp5Vz7obs0alZBnwvBhsr9hOt5mn3fSddFF91F8o";
		
		private static String[] handdles = {"guptpuneet", "andreazurek", "swethareddy", "sanjaymodi", "RajanAnandan"};

		public static void main(String[] args) {
			
			/*Scanner sc = new Scanner(System.in);
			System.out.print("Enter the handle:");
			String handle = sc.next();*/
			for (String handdles : handdles) {
			 getTwitterFeeds(handdles);
			}
		}
		
		private static void getTwitterFeeds(String handle) {
			 			
			try {

				TwitterTemplate twitterTemplate = new TwitterTemplate(
						twtConsumerKey, twtConsumerSecret, twtAccessToken,
						twtAccessTokenSecret);
				List<Tweet> tweets = twitterTemplate.timelineOperations().getUserTimeline(handle, 200);	
				System.out.println("------------------------------------------------"+handle+"--------------------------------------------------------------------");
				for(Tweet tweet: tweets){
					
					System.out.println(tweet.getText());	
				}			
				System.out.println();
				
			} catch (Exception e) {
				 e.printStackTrace();
				 System.err.println("{getTwitterFeeds} error occured  : "+ e.getMessage());
			}
		

	}

}

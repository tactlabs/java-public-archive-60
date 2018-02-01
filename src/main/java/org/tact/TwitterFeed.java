package org.tact;


import java.util.List;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

public class TwitterFeed {

	private static String twtConsumerKey = "m19IMoIFCdSmCeKOA43K0SuuD";

	private static String twtConsumerSecret = "D56NklMyKAgtgp3ZxdQNQITsxugpS54P44vVS9rWA5wQ3Fekgh";

	private static String twtAccessToken = "3387978868-bzW7KiZZmuAGD9EhdI81GgHZDu7f9rPjuqNHqzQ";

	private static String twtAccessTokenSecret = "kmJjsVp5Vz7obs0alZBnwvBhsr9hOt5mn3fSddFF91F8o";

	// https://twitter.com/rajacsp
	
	
 private static String[] handdles = {
"gobumpr",
"uniphore",
"walletkit",
"Repisodic",
"Avocare",
"Medssenger",
"Sway",
"Labtician",
"ConsultLoop",
"Pacific Vision Foundation",
"Aria Innovation",
"Hearing Aid Rental",
"Hearing Aid Rental",
"Tinteo",
"Resolve",
"Apollo",
"Health Casa",
"Live Well",
"Livpact",
"Black Health",
"Thrive",
"Keritan",
"Myovue",
"CareTeam",
"Biomarket.io",
"VW",
"Blue Mesa",
"IRSI",
"CircleLink",
"CRV ",
"Spark Capital",
"NextView Ventures",
"RoughDraft.vc ",
"DormRoom Fund ",
"EverTrue",
"LeadPages",
"Engagio",
"Helpful"

                
		}; 
//	private static String twtHandle = "uniphore";

	       public static void main(String[] args) throws Exception{
		
		// for loop 
	    	 for (String handdles:handdles) {
	    		  
	    		 //  tf.setCreatedAt(""+tweet.getCreatedAt());
	    		  // tf.setFeedId(strFeedId);
	    	   
		 
		      getTwitterFeeds(handdles);  
		      
		       }
	    	// getFollowers();
		     
	                                                      }
	
	// add handle param
	private static void getTwitterFeeds(String handle) {
		try {

			TwitterTemplate twitterTemplate = new TwitterTemplate(twtConsumerKey, twtConsumerSecret, twtAccessToken, twtAccessTokenSecret);

			
			List<Tweet> tweets = twitterTemplate.timelineOperations().getUserTimeline(handle, 50);
			//List<Tweet> tweets = twitterTemplate.timelineOperations().getFavorites(twtHandle, 1000);
			
			for (Tweet tweet : tweets) {

				//String strFeedId = tweet.getId() + "";

				
				//System.out.println("Created at : "+tweet.getCreatedAt());

				//if(tweet.gettype("hiring"))
				
				String tweetContent = tweet.getText();
				
				if(tweetContent.toLowerCase().contains("hiring")){
					System.out.println("TWEET :"+tweetContent);
				}
				
				
				
				//System.out.println("GET Character:"+((getCharacter()) tweet).);
				
				/*
				sf.setFeedId(strFeedId);
				sf.setSource("Twitter");
				sf.setLink("https://twitter.com/statuses/" + strFeedId);
				sf.setMessage(tweet.getText());
				sf.setSync_date(new Date());
				sf.setTitle("");
				sf.setType("TWEET");
				sf.setUploaded_date(tweet.getCreatedAt());
				sf.setUser_id(""+tweet.getFromUserId());
				sf.setUser(tweet.getFromUser());
				*/
				
			}
			//System.out.println("{getTwitterFeeds} Completed getTwitterFeeds");

		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println("{getTwitterFeeds} error occured  : "+e.getMessage());
		}
	}
	
	public static void getFollowers(String twtHandle){
		TwitterTemplate twitterTemplate = new TwitterTemplate(twtConsumerKey, twtConsumerSecret, twtAccessToken, twtAccessTokenSecret);
		List<TwitterProfile> followers = twitterTemplate.friendOperations().getFollowers(twtHandle);// fix twtH
		
		for (TwitterProfile twitterProfile : followers) {
			System.out.println(twitterProfile.getName());
		}
	}


}
